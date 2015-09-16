import java.util.Scanner;
public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		// Convert Fahrenheit to Celsius
		double celsius = (5 / 9.0) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " +
		celsius + " in Celsius");

		System.out.println((int)1.7);
		System.out.println(1.0 - 0.9);
		double x = 0;
		x = 1.0 - 0.9;
		System.out.println(x);
	}
}
