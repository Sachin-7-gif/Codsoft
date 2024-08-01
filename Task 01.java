import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Guess a number between 1 and 100:");

        while (!hasGuessedCorrectly) {
            int userGuess = scanner.nextInt();
            numberOfTries++;
            if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Correct! You've guessed the number in " + numberOfTries + " tries.");
            }
        }
        scanner.close();
    }
}
