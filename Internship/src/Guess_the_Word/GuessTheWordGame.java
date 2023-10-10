package Guess_the_Word;
import java.util.Scanner;

public class GuessTheWordGame {
    public static void main(String[] args) {
        // Define the hidden word
        String hiddenWord = "programming";

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display instructions to the user
        System.out.println("Welcome to the Guess the Word game!");
        System.out.println("Try to guess the hidden word.");

        // Initialize variables
        boolean wordGuessed = false;
        int attempts = 0;

        // Main game loop
        while (!wordGuessed) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine();

            // Check if the user's guess matches the hidden word
            if (userGuess.equalsIgnoreCase(hiddenWord)) {
                wordGuessed = true;
                System.out.println("Congratulations! You guessed the correct word: " + hiddenWord);
                System.out.println("It took you " + (attempts + 1) + " attempts.");
            } else {
                System.out.println("Incorrect guess. Try again.");
                attempts++;
            }
        }

        // Close the scanner
        scanner.close();
    }
}

