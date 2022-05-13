import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readFibonaci {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new FileReader("./dataFibonaci.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                if (line != null) {
                    fibonacci.add(Integer.parseInt(line));
                }
            }
            String everything = sb.toString();
        } finally {
            br.close();
        }
        for (int i = 0; i < fibonacci.size(); i++) {
            System.out.println(fibonacci.get(i));
        }
    }
}
