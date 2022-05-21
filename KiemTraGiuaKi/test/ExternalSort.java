import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class ExternalSort {
    static int N = 2000000;
    static int M = 100000;

    public static void externalSort(String fileIn, String fileOut) {
        String tfile = "data/temp-file-";
        int[] buffer = new int[M < N ? M : N];

        try {
            FileReader fr = new FileReader(fileIn);
            BufferedReader br = new BufferedReader(fr);
            int slices = (int) Math.ceil((double) N / M);

            int i, j;
            i = j = 0;

            for (i = 0; i < slices; i++) {
                for (j = 0; j < (M < N ? M : N); j++) {
                    String t = br.readLine();
                    if (t != null)
                        buffer[j] = Integer.parseInt(t);
                    else
                        break;
                }

                Arrays.sort(buffer);

                FileWriter fw = new FileWriter(tfile + Integer.toString(i) + ".txt");
                PrintWriter pw = new PrintWriter(fw);
                for (int k = 0; k < j; k++)
                    pw.println(buffer[k]);

                pw.close();
                fw.close();
            }

            br.close();
            fr.close();

            int[] topNums = new int[slices];
            BufferedReader[] brs = new BufferedReader[slices];

            for (i = 0; i < slices; i++) {
                brs[i] = new BufferedReader(new FileReader(tfile + Integer.toString(i) + ".txt"));
                String t = brs[i].readLine();
                if (t != null)
                    topNums[i] = Integer.parseInt(t);
                else
                    topNums[i] = Integer.MAX_VALUE;
            }

            FileWriter fw = new FileWriter(fileOut);
            PrintWriter pw = new PrintWriter(fw);

            for (i = 0; i < N; i++) {
                int min = topNums[0];
                int minFile = 0;

                for (j = 0; j < slices; j++) {
                    if (min > topNums[j]) {
                        min = topNums[j];
                        minFile = j;
                    }
                }

                pw.println(min);
                String t = brs[minFile].readLine();
                if (t != null)
                    topNums[minFile] = Integer.parseInt(t);
                else
                    topNums[minFile] = Integer.MAX_VALUE;

            }
            for (i = 0; i < slices; i++)
                brs[i].close();

            pw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String file_in = "./input.txt";
        String file_out = "./external-sorted.txt";
        externalSort(file_in, file_out);
    }
}