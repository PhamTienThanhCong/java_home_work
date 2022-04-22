public class Test {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        StackLinkedList stackll = new StackLinkedList();
        StackArray stack = new StackArray();
        stackll.setArray(arr);
        stack.setArray(arr);
        stackll.printList();
        System.out.println("");
        stack.printList();
    }
}
