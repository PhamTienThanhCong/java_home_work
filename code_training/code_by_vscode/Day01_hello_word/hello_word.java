import java.util.Scanner;

public class hello_word{
    
    static void printTest(String name) {
        System.out.print("hello ");
        System.out.println(name);
    }

    public static void main(String[] args) {

        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        
        name = sc.nextLine();

        for (int i = 0; i < 10; i++) {
            printTest(name);
        }
    }
}