public class Test {
    public static void main(String[] args)
    {
        double[] arr =  new double[] {1, 2, 3};
        double[] arr2 =  new double[] {4, 5, 6};
        Vertor x = new Vertor(arr, arr.length);
        Vertor y = new Vertor(arr2, arr2.length);
        Vertor z = new Vertor(arr, arr.length);

        z.cong(x, y, z);
        System.out.println(z.toString());

    }
}
