import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        while loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }


//        do while to 100 incremented by 2
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100);

//        count backwards from 100 to -10 by 5's
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while(i <= 1_000_000);

//        refactor previous two

//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 1_000_000; i *= i) {
//            System.out.println(i);
//        }

//        fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else{
//                    System.out.println(i);
//                }
//            }

//Display a table of powers.
//
//Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//Assume that the user will enter valid data.
//Only continue if the user agrees to.

        Scanner scanner = new Scanner(System.in);

        boolean confirm;
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(int i = 1; i <= userInt; i++){
//                int square = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-7s|%-9s|%-6s\n", i, square, cubed);
//            }
//            System.out.println("Continue? [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//        }while(confirm);
//        System.out.println("Cool. see you next time!");



//        Convert given number grades into letter grades.
//
//Prompt the user for a numerical grade from 0 to 100.
//
//Display the corresponding letter grade.
//
//Prompt the user to continue.
//
//Assume that the user will enter valid integers for the grades.
//
//The application should only continue if the user agrees to.
//
//Grade Ranges:
//
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0

        do {
            System.out.println("Enter a numerical grade from 0 to 100: ");
            int userGrade = scanner.nextInt();

            if(userGrade >= 88 && userGrade <= 100) {
                System.out.println("A");
            }else if(userGrade >= 80 && userGrade <= 87) {
                System.out.println("B");
            }else if(userGrade >= 67 && userGrade <= 79) {
                System.out.println("C");
            }else {
                System.out.println("F");
            }
            System.out.println("Continue? [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");
        }while(confirm);
        System.out.println("K thanks bye!");
    }
}