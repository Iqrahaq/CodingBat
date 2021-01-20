import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        String question = "What is the capital of Pakistan?";
        String choiceOne = "Lahore";
        String choiceTwo = "Islamabad";
        String choiceThree = "Karachi";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose from " + choiceOne + ", " + choiceTwo + " or " + choiceThree);

        Scanner input = new Scanner(System.in);
        String inputtedChoice = input.next();

        if(correctAnswer.equalsIgnoreCase(inputtedChoice)){
            System.out.println("Congrats! You are correct!");
        } else {
            System.out.println("Sorry! Wrong answer!");
            System.out.println("The correct answer is: " + correctAnswer);
        }
    }
}
