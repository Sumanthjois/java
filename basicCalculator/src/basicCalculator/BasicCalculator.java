package basicCalculator;
import java.util.Scanner;

public class BasicCalculator {
	static Scanner scan = new Scanner(System.in);
	static Addition addObject = new Addition();
	static Subtraction subObject = new Subtraction();
	static Multiplication multObject = new Multiplication();
	static Division divObject = new Division();
	static String operation;
	static int num1, num2;
	static double ans;

	public static void main(String[] args) {		
		System.out.println("I'm a basic calculator. Please enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter the second number:");
		num2 = scan.nextInt();
		System.out.println("a = addition, s = subtraction, m = multiplication, d = division");
		operation = scan.nextLine();
		
		try {
			switch(operation) {
			case "a":
				ans = addObject.add(num1, num2);
				System.out.println(ans);
				break;
			case "s":
				ans = subObject.subtract(num1, num2);
				System.out.println(ans);
				break;
			case "m":
				ans = multObject.multiply(num1, num2);
				System.out.println(ans);
				break;
			case "d":
				ans = divObject.divide(num1, num2);
				System.out.println(ans);
				break;
			default: 
				System.out.println("Error. You did not enter a number. GoodBye!");
				break;
			}
		} finally {
			scan.close();
			System.exit(0);
		}

	}
}
