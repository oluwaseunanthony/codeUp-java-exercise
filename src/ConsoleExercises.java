import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an Integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("Your new integer is: %d%n", userInput);

//        Scanner scanner2 =new Scanner(System.in);
//        System.out.println("Enter 3 words separated by a space: ");
//
//        String input1 = scanner2.next();
//        String input2 = scanner2.next();
//        String input3 = scanner2.next();
//
//        System.out.printf("The words you entered are: %n %s%n %s%n %s%n", input1, input2, input3);

//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Enter a sentence: ");
//
//        String sentence = scanner3.nextLine();
//
//        System.out.printf("Here is your sentence: %n %s%n", sentence);

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("length: ");
        double length = scanner4.nextInt();

        System.out.println("width: ");
        double width = scanner4.nextInt();
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);

        System.out.printf("the area is : %n %s%n", area);
        System.out.printf("the perimeter is: %n %s%n", perimeter);

    }

}
