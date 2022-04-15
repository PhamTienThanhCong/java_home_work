import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] x;
        int n;
        System.out.print("Nhap So Luong: ");
        n = sc.nextInt();
        x = new double[n];
        System.out.println("nhap mang: ");
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            sum += x[i];
        }
        System.out.println("Trung Binh Cong: " + sum/n);
        Arrays.sort(x);
        System.out.print("Day So: ");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i]+" ");
        };
    }
}