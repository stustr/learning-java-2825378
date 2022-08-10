import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Where do Newcastle FC play their home home games?";
        String choiceOne = "St James' Park'";
        String choiceTwo = "Old Trafford";
        String choiceThree = "Stadium of light";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        try (// Have the user input an answer
                // Retrieve the user's input
        Scanner input = new Scanner(System.in)) {
            String userInput = input.next();
            
            // If the user's input matches the correctAnswer...
            // then the user is correct and we want to print out a congrats message to the user.
            if(userInput.equals(correctAnswer)) {
                System.out.println("Correct");
            }
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            else {
                System.out.println("Incorrect. The correct answer was St James' Park.");
            }
        }
    }

}
