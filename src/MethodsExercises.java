import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        // Test basic arithmetic methods
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(5, 3));
        System.out.println("Multiplication: " + multiply(5, 3));
        System.out.println("Division: " + divide(6, 3));
        System.out.println("Modulus: " + modulus(7, 3));

        // Test multiplication without * operator
        System.out.println("Multiplication without * operator: " + multiplyWithoutOperator(4, 3));

        // Test user input validation
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("User input: " + userInput);

        // Test factorial calculation
        System.out.print("Enter an integer between 1 and 10: ");
        int userFactorialInput = getInteger(1, 10);
        long factorialResult = calculateFactorial(userFactorialInput);
        System.out.println(userFactorialInput + "! = " + factorialResult);

        // Test dice rolling simulation
        simulateDiceRoll();

        // High-Low guessing game
        playHighLowGame();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero");
            return 0; // You can modify this behavior as needed
        }
    }

    public static int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Cannot find modulus with divisor zero");
            return 0; // You can modify this behavior as needed
        }
    }

    public static int multiplyWithoutOperator(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next(); // Consume the invalid input
            }
            userInput = scanner.nextInt();
            if (userInput < min || userInput > max) {
                System.out.print("Input out of range. Enter a number between " + min + " and " + max + ": ");
            }
        } while (userInput < min || userInput > max);
        return userInput;
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void simulateDiceRoll() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of sides for a pair of dice: ");
        int numSides = scanner.nextInt();

        do {
            int dice1 = generateRandomNumber(numSides);
            int dice2 = generateRandomNumber(numSides);

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);

            System.out.print("Roll again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));
    }

    public static int generateRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }

    public static void playHighLowGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int userGuess;
        int guessCount = 0;
        final int maxGuesses = 10;

        System.out.println("Welcome to the High-Low guessing game!");

        do {
            System.out.print("Guess the number (between 1 and 100): ");
            userGuess = getInteger(1, 100);
            guessCount++;

            if (userGuess < targetNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > targetNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS! It took you " + guessCount + " guesses.");
                return;
            }

            if (guessCount == maxGuesses) {
                System.out.println("Sorry, you've reached the maximum number of guesses. The correct number was " + targetNumber + ".");
                return;
            }
        } while (true);
    }
}
