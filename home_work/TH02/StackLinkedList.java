import java.util.LinkedList;

public class StackLinkedList implements StackInterface{
    private LinkedList<Integer> ll;
    private int Size;

    public StackLinkedList(LinkedList<Integer> ll, int size) {
        this.ll = ll;
        Size = size;
    }
    
    public StackLinkedList(StackLinkedList ll) {
        this.Size = ll.Size;
        this.ll = ll.ll;
    }

    public StackLinkedList(){
        this.ll = new LinkedList<Integer>();
        this.Size = 0;
    }

    private void upSize(){
        this.Size++;
    }
    private void unSize(){
        this.Size--;
    }

    @Override
    public void Push(int newVar) {
        ll.addLast(newVar);
        upSize();
    }

    @Override
    public int Pop() {
        if(Size() == 0){
            System.out.print("Ngan Xep Rong");
            return 0;
        }
        unSize();   
        return ll.pollLast();
    }

    @Override
    public int Peek() {
        if(Size() == 0){
            System.out.print("Ngan Xep Rong");
            return 0;
        }
        return ll.getLast();
    }

    @Override
    public int Size() {
        return this.Size;
    }

    @Override
    public void printList() {
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
