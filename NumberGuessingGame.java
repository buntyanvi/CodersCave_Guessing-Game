import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numberRange = 100; // Default range
        int randomNumber = random.nextInt(numberRange) + 1;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Enter the range of numbers (1 to n): ");
        numberRange = input.nextInt();
        randomNumber = random.nextInt(numberRange) + 1;

        System.out.println("I have chosen a number between 1 and " + numberRange + ".");
        System.out.println("Try to guess the number!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game!");
        input.close();
    }
}
