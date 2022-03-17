class StackArray {
    private int arr[];
    private int size;

    public StackArray(){
        this.arr = new int[50];
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    private void upSize(){
        this.size += 1;
    }

    private void lowSize(){
        this.size -= 1;
    }

    public void push(int a){
        this.arr[size] = a;
        upSize();
    }

    public int pop(){
        if (size == 0){
            System.out.print("Ngan Xep Rong ");
            return -1;
        }
        lowSize();
        return this.arr[size];
    }

    public int peek() {
        if (size == 0){
            System.out.print("Ngan Xep Rong ");
            return -1;
        }
        return this.arr[size-1];
    }

    public static void main(String[] args) {
        StackArray arr = new StackArray();
        arr.push(1);
        arr.push(2);
        // arr.push(3);
        System.out.println("Chieu Dai: "+arr.size());
        System.out.println(arr.pop());
        System.out.println(arr.peek());
        System.out.println(arr.pop());
        System.out.println("Chieu Dai: "+arr.size());
        System.out.println(arr.pop());
        
    }
}