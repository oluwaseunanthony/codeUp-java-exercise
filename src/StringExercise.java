import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {
        // Output examples
        String output1 = "We don't need no education\nWe don't need no thought control";
        String output2 = "Check \"this\" out!, \"s inside of \"s!";
        String output3 = "In windows, the main drive is usually C:\\";
        String output4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";

        // Print output examples
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }
}

class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bob: Hi there! How can I help you today?");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                // Bob's response when there is no input
                System.out.println("Bob: Fine. Be that way!");
            } else if (userInput.endsWith("?")) {
                // Bob's response to a question
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                // Bob's response to yelling
                System.out.println("Bob: Whoa, chill out!");
            } else {
                // Bob's default response
                System.out.println("Bob: Whatever.");
            }

            System.out.print("Do you want to continue talking to Bob? (yes/no): ");
            String continueTalking = scanner.nextLine().toLowerCase();
            if (!continueTalking.equals("yes")) {
                // End the conversation if the user doesn't want to continue
                System.out.println("Bob: Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
