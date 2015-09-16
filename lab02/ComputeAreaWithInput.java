import java.util.Scanner;

public class ComputeAreaWithInput {
	double PI = 3.14159;

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please input radius :");
		double radius = input.nextDouble();

		double area;
		area = radius * radius * PI;

		System.out.println("the area of radius " + radius + " = " + area);
	}
}
