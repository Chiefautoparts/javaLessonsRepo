import java.util.Scanner;

public class input {
	public static void main(String[] args){
		String name;
		int age;
		float height;
		//... Initialize Scanner to read from the console
		Scanner userInput = new Scanner();
		System.out.println("Enter your name: ");
		name = userInput.next();
		System.out.println("Enter your age: ");
		age = userInput.nextInt();
		System.out.println("Enter your height: ");
		height = userInput.nextFloat();
		System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height); 
	}
}