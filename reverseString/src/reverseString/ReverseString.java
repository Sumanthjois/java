package reverseString;
import java.util.Scanner;

public class ReverseString {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String word, reversed;
		
		System.out.println("Enter a word and I will reverse it.");
		word = input.nextLine();
		reversed = new StringBuilder(word).reverse().toString();
		System.out.println("Your reversed word: (Boom!) " + reversed);
	}
}
