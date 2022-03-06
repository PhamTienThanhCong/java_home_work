import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Bai2{

    public static int[][] first;
    public static int[][] secont;
    public static int firstX;
    public static int firstY;

    static void readFile() throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("matrix.txt"));
    
        String firstDimension = reader.readLine();
        String[] split = firstDimension.split(" ");
        firstX = Integer.parseInt(split[0]);
        firstY = Integer.parseInt(split[0]);
    
        first = new int[firstX][firstY];
        secont = new int[firstX][firstY];
    
        for (int i = 0; i < firstX; i++) {
            String[] line = reader.readLine().split(" ");
    
            for (int j = 0; j < firstY; j++) {
                first[i][j] = Integer.parseInt(line[j]);
            }
    
        }
 
        for (int i = 0; i < firstX; i++) {
            String[] line = reader.readLine().split(" ");
    
            for (int j = 0; j < firstY; j++) {
                secont[i][j] = Integer.parseInt(line[j]);
            }
    
        }
        // Read "@"
        reader.readLine();
        reader.close();
    }

    public static void PrintMatrix(int arr[][]){
        for (int i = 0; i < firstX; i++) {
            for (int j = 0; j < firstY; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int[][] Add2Matrix(int arr1[][],int arr2[][]){
        int[][] Sum2Matrix = new int[firstX][firstY];
        int sum = 0;
        for (int i = 0; i < firstX; i++) {
            for (int j = 0; j < firstY; j++) {
                sum = arr1[i][j] + arr2[i][j];
                Sum2Matrix[i][j] = sum;
            }
        }
        return Sum2Matrix;
    }

    public static int[][] Multi2Matrix(int arr1[][],int arr2[][]){
        int[][] C = new int[firstX][firstY];
        for (int i = 0; i < firstX; i++) {
            for (int j = 0; j < firstY; j++) {
                for (int k = 0; k < firstX; k++)
                    C[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
        return C;
    }

    public static int[][] MatrixChuyenVi(int arr1[][]){
        int[][] C = new int[firstX][firstY];
        for (int i = 0; i < firstX; i++) {
            for (int j = 0; j < firstY; j++) {
                C[j][i] = arr1[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) throws IOException {
        readFile();
        System.out.println("Matrix 1");
        PrintMatrix(first);
        System.out.println("Matrix 2");
        PrintMatrix(secont);
        System.out.println("Matrix 1+ Matrix 2");
        int[][] sum2matrix = Add2Matrix(first,secont);
        PrintMatrix(sum2matrix);
        System.out.println("Matrix 1 * Matrix 2");
        int[][] Multi2Matrix = Multi2Matrix(first,secont);
        PrintMatrix(Multi2Matrix);
        System.out.println("Matrix 1 chuyen vi");
        int[][] MatrixChuyenVi = MatrixChuyenVi(first);
        PrintMatrix(MatrixChuyenVi);
    }
}