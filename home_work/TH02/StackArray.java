import java.util.ArrayList;

public class StackArray implements StackInterface{
    private int size;
    private ArrayList<Integer> arr;
    public StackArray(){
        size = 0;
        arr = new ArrayList<Integer>();;
    }
    private void upSize(){
        this.size++;
    }
    private void unSize(){
        this.size--;
    }
    @Override
    public void Push(int newVar) {
        this.arr.add(newVar);
        upSize();
    }
    @Override
    public int Pop() {
        if(size == 0){
            System.out.print("Ngan Xep Rong");
            return 0;
        }
        int var = Peek();
        this.arr.remove(this.size - 1);
        unSize();
        return var;
    }
    @Override
    public int Peek() {
        if(size == 0){
            System.out.print("Ngan Xep Rong");
            return 0;
        }
        return this.arr.get(this.size - 1);
    }
    @Override
    public int Size() {
        return this.size;
    }
    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.Push(12);
        stack.Push(123);
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
    }

}
