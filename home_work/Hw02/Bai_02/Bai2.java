import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bai2{

    public static void Redfile(String src) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(src));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(line);
            }
        } finally {
            br.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Redfile("matrix.txt");
    }
}