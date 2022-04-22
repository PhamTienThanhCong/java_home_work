public class Test {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        StackArray stack = new StackArray();
        stack.setArray(arr);
        stack.printList();
    }
}
