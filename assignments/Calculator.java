import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		// Declaring the variables
		int num1 = 0;
		int num2 = 0;
		char operator;
		double answer = 0.0;

		// User input method
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
		num1 = input.nextInt();
		System.out.println("Enter second number: ");
		num2 = input.nextInt();
		System.out.println("What operation?");
		operator = input.next().charAt(0);

		//Switch case
		switch(operator){
			case '+': answer = num1 + num2;
				break;
			case '-': answer = num1 - num2;
				break;
			case '*': answer = num1 * num2;
				break;
			case '/': answer = num1 / num2;
				break;
		}

		// Display output
		System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);


	}
}