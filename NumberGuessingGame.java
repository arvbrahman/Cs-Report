import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Main method to run the game
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        // Loop until the player guesses the correct number
        while (!hasWon) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            // Check if the guess is correct
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.!!!!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.!!!!");
            } else {
                hasWon = true;
            }
        }

        // Congratulate the player
        System.out.println("Congratulations!!!! You've guessed the correct number: " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries.");
        
        scanner.close();
    }
}






