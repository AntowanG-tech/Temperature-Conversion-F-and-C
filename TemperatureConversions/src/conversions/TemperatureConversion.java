package conversions;

/* Create a program that asks the user to enter a temperature in degrees Fahrenheit. Convert
 * the temperature to degrees Celsius. Then ask the user to enter a temperature in Celsius.
 * Convert the temperature to degrees Fahrenheit. the formulas needed are C = (F-32) * 5/9
 * and F = 9/5 * C + 32.
 */

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a Fahrenheit temperature: ");
		double fahrenheit = input.nextDouble();

		// Convert Fahrenheit to Celsius
		double celsiusResult = (5.0 / 9) * (fahrenheit - 32);
		System.out.println(fahrenheit + "F is equivalent to " + celsiusResult + "C");

		System.out.print("Enter a Celsius temperature: ");
		double celsiusTemp = input.nextDouble();

		// Convert Celsius to Fahrenheit
		double fahrenheitResult = (9.0 / 5) * celsiusTemp + 32;
		System.out.println(celsiusTemp + "C is equivalent to " + fahrenheitResult + "F");

	}

}
