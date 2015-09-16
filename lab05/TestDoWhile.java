import java.util.Scanner;

public class TestDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data;
		do {
			System.out.print("Input data (0 to Exit) :");
			data = input.nextInt();
			
		} while (data != 0);
	}
}
