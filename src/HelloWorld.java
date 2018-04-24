import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		String userInput;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Text: ");
		userInput = scan.nextLine();

		System.out.println(userInput);

		scan.close();

	}

}
