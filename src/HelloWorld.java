import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        int id;
//        boolean isLoggedIn;
//        float bankAccountBalance;
//        id = 123;
//        isLoggedIn = false;
//        bankAccountBalance = 1000.23F;
//
//        int theAnswer = 42;
//        String question = "What is your favorite color?";


//        Java has a notion of constants, denoted by the final keyword.
//        final int SIDES_OF_A_DICE = 6;
//        final String API_KEY = "b75b703d8195f6f433ca";
//        final String GITHUB_API_BASE_URL = "https://api.github.com";
//
//        int myInteger = 900;
//        long morePrecise = myInteger;
//
//        double pi = 3.14159;
//        int almostPi = (int) pi;

//        System.out.println(pi);
//        System.out.println(almostPi);

//----------Java Syntax, Data Types, and Variables Exercise--------

//  TODO     1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//int myFavoriteNumber = 9;
//        System.out.println(myFavoriteNumber);

//  TODO      2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.

//        String myString = "This is my string";
//        System.out.println(myString);


//  TODO      3. Change your code to assign a character value to myString. What do you notice?
//myString = "T";
//        System.out.println(myString);
//        myString = 't';
//        System.out.println(myString);

//  TODO      4. Change your code to assign the value 3.14159 to myString. What happens?
//myString = 3.14159;
//        System.out.println(myString);

//  TODO      5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber);

//  TODO     6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//myNumber = 3.14;
//        System.out.println(myNumber);
//  TODO      7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//myNumber = 123L;
//        System.out.println(myNumber);
//  TODO      8.Change your code to assign the value 123 to myNumber.
//        myNumber = 123;
//        System.out.println(myNumber);
//Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

//  TODO      9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        double myNumber = 3.14;
//        System.out.println(myNumber);

//   TODO     10. Copy and paste the following code blocks one at a time and execute them

//        int x = 5;
//System.out.println(x++);
//System.out.println(x);
//int x = 5;
//System.out.println(++x);
//System.out.println(x);

//        What is the difference between the above code blocks? Explain why the code outputs what it does.




//  TODO      11. Try to create a variable named class. What happens?
//String myClass = "This is string";


//  TODO      12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o;
//        System.out.println(three);

//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//How is the above example different from the code block below?


//  TODO      13. Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//x = x + 5;
//        x += 5;
//        System.out.println(x);
//int x = 3;
//int y = 4;
//y *= x;
//        System.out.println(y);
//y = y * x;
//int x = 10;
//int y = 2;
//x /= y;
//        System.out.println(x);
//x = x / y;
//        y -= x;
//        System.out.println(y);
//y = y - x;

//  TODO      14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

//byte myNum = 127;
//        System.out.println(myNum++);
//        System.out.println(myNum);



//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

//-------- Console Input and Output Lecture ---------

//        System.out.println("hello");
//        System.out.print("world");
        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);

        String greeting = "Salutations";
        System.out.printf("%s, %s. %n", greeting, name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}