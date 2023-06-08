package JavaCode;
import java.util.Scanner;

public class FirstTime {

	public static void main(String[] args) {

		 System.out.print("Enter first number: ");
	        int num1 = extracted().nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = extracted().nextInt();

	        int sum = num1 + num2;
	        System.out.println("Sum: " + sum);
	}

	private static Scanner extracted() {
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}

}
