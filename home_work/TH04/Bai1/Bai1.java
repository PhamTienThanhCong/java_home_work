import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static ArrayList<Integer> readFile() throws FileNotFoundException {
        // BufferedReader abc = new BufferedReader(new FileReader("./Bai1/dayso.txt"));
        // List<String> lines = new ArrayList<String>();

        // String line;
        // while((line = abc.readLine()) != null) {
        // lines.add(line);
        // }
        // abc.close();

        // String[] data = lines.toArray(new String[]{});
        // System.out.println(data[0]);
        // return data;
        File txt = new File("./Bai1/dayso.txt");
        Scanner scan = new Scanner(txt);
        ArrayList<Integer> data = new ArrayList<Integer>();
        while (scan.hasNextInt()) {
            data.add(scan.nextInt());
        }
        return data;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> data = readFile();
        data.sort(null);
        try {
            FileWriter  myWriter  = new FileWriter("./Bai1/sapxep.txt");
            for (int i = 0; i < data.size(); i++) {
                myWriter.write(data.get(i) + " ");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}