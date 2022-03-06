public class Fibonacci {
    private static long findSum(long n) {
        long currentValue = 1, prevValue = 0, sum = 0, temp;
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        sum = 1;
        for (long i = 2; i < n; i++) {
            temp = currentValue;
            currentValue = prevValue + currentValue;
            prevValue = temp;
            sum += currentValue;
        }
        return sum;
    }
    public static void main(String[] args) {
        long n = findSum(100L);
        System.out.println(n);
    }
}