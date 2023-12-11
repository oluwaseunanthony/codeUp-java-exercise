import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        // Exercise 1: Output the value of pi with two decimal places
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // Exercise 2: Prompt user to enter an integer and display it
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInteger = scanner.nextInt();
        System.out.println("You entered: " + userInteger);

        // Exercise 3: Prompt user to enter three words and display them on separate lines
        scanner.nextLine(); // Consume the newline character left by nextInt
        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("Words entered:\n" + word1 + "\n" + word2 + "\n" + word3);

        // Exercise 4: Prompt user to enter a sentence and display it
        scanner.nextLine(); // Consume the newline character left by next()
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        // Exercise 5: Prompt user for length and width of a classroom, calculate area and perimeter
        System.out.print("Enter the length of the classroom: ");
        String lengthInput = scanner.nextLine();
        System.out.print("Enter the width of the classroom: ");
        String widthInput = scanner.nextLine();

        double length = Double.parseDouble(lengthInput);
        double width = Double.parseDouble(widthInput);

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of the classroom: " + area);
        System.out.println("Perimeter of the classroom: " + perimeter);

        // Bonus: Accept decimal entries for length and width
        scanner.useDelimiter("\n");
        System.out.print("Enter the length of the classroom (decimal): ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the classroom (decimal): ");
        width = scanner.nextDouble();

        area = length * width;
        perimeter = 2 * (length + width);
        double volume = length * width * 10; // Assuming a height of 10 for volume

        System.out.println("Area of the classroom: " + area);
        System.out.println("Perimeter of the classroom: " + perimeter);
        System.out.println("Volume of the classroom: " + volume);

        scanner.close();
    }
}
