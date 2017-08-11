import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter any word");
		String anyWord = input.next();

		StringBuilder a = new StringBuilder(anyWord);
		StringBuilder b = new StringBuilder(a);

		if (b.toString().equals(a.reverse().toString())) {
			System.out.println("This is a Palindrome");

		} else {
			System.out.println("This is NOT a Palindrome");

		}
	}
}