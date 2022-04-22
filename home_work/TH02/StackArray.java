import java.util.ArrayList;

public class StackArray implements StackInterface{
    private int size;
    private ArrayList<Integer> arr;
    public StackArray(){
        this.size = 0;
        this.arr = new ArrayList<Integer>();;
    }
    public StackArray(StackArray arr){
        this.size = arr.Size(); 
        this.arr = arr.arr;
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
    @Override
    public void printList() {
        StackArray newLL = new StackArray(this);
        while(this.Size()>0){
            System.out.print(this.Pop() +" ");
        }
        
    }
    @Override
    public void setArray(int arr[]) {
        for (int i = 0; i < arr.length; i++){
            Push(arr[i]);
        }
    }

}
