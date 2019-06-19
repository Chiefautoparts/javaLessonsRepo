import java.util.random;
// import java.util.Scanner;

public class Quiz {
	public static void main(String[] args){
		Random rand = new Random();
		Console input = new Console();

		int choice;
		String selection;
		QuestionList = new String[2][2];

		QuestionList[0][0] = "What is my favorite sports team? \nA: Seattle Seahawks\nB: Pittsburgh Penguins\nC: Philidelphia Flyers";
		QuestionList[0][1] = "B: Pittsburgh Penguins";
		QuestionList[1][0] = "What is my favorite programming language? \nA: Java\nB: C#\nC: iOS";
		QuestionList[1][1] = "A: Java";
		QuestionList[2][0] = "What is my age? \nA: 400 years old\nB: 10 years old\nC: 27 years old";
		QuestionList[2][1] = "C: 27 years old";

		int round = 0;
		while(round < questions){
			choice = rand.nextInt(3);
			System.out.println(QuestionList[choice][0]);
			selection = input.readLine();
			if (selection.equals(QuestionList[choice][1])){
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect, the answer was " + QuestionList[choice][1]);
			}
			round = round + 1;
		}
	}
}