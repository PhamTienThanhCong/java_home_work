import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("what your name: ");
		
		name = sc.nextLine();
		
		System.out.print("hello word "+name);
	}
}
