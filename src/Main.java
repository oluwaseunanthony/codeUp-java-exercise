public class Main {
    public static void main(String[] args) {
        // Step 1
        int myFavoriteNumber = 7;
        System.out.println("My favorite number: " + myFavoriteNumber);
        // Explanation: Declare an int variable, assign a value, and print it.

        // Step 2
        String myString = "Hello, World!";
        System.out.println("My string: " + myString);
        // Explanation: Declare a String variable, assign a value, and print it.

        // Step 3
        // Uncommenting the next line will result in a compilation error.
        // myString = 'A'; // Error: incompatible types
        // Explanation: Attempting to assign a char to a String variable causes a compilation error.

//        myString ="T";
//        System.out.println(mystring);
//        myString ="t";
//        System.out.println(mystring);

        // Step 4
        // Uncommenting the next line will result in a compilation error.
        // myString = 3.14159; // Error: incompatible types
        // Explanation: Attempting to assign a double to a String variable causes a compilation error.

        // Step 5
        long myNumber;
        // Uncommenting the next line will result in a compilation error.
        // System.out.println(myNumber); // Error: variable myNumber might not have been initialized
        // Explanation: Trying to print an uninitialized variable causes a compilation error.

        // Step 6
        // Uncommenting the next line will result in a compilation error.
        // myNumber = 3.14; // Error: incompatible types
        // Explanation: Assigning a double value to a long variable causes a compilation error.

        // Step 7
        myNumber = 123L;
        // Explanation: Assigning a long value to a long variable.

        // Step 8
        // Uncommenting the next line will result in a compilation error.
        // myNumber = 123; // Error: incompatible types
        // Explanation: Assigning an int value to a long variable causes a compilation error.

        // Step 9
        // Assigning a floating-point value (e.g., 3.14) to a variable declared as long does not compile
        // because of a loss of precision. Long can't directly store a floating-point value.
        // To fix this, you can either declare myNumber as a double or cast the double value to a long.

        // Step 10
        float myFloatNumber = 3.14f; // Adding 'f' to indicate it's a float.
        System.out.println("My float number: " + myFloatNumber);
        // Explanation: Declaring a float variable and assigning a float value to it.

        // Step 11
        // Code Blocks
        int x = 5;
        System.out.println(x++); // Post-increment: prints 5, then increments to 6
        System.out.println(x);   // Prints the incremented value, which is now 6

        int y = 5;
        System.out.println(++y); // Pre-increment: increments to 6, then prints 6
        System.out.println(y);   // Prints the incremented value, which is 6
        // Explanation: Demonstrating post-increment and pre-increment operators.

        // Step 12
        // Uncommenting the next line will result in a compilation error.
        // int class = 10; // Error: class expected
        // Explanation: Using a reserved keyword as a variable name causes a compilation error.

        // Step 13
        // This will result in a runtime error (ClassCastException).
        // Uncomment and run the following code to observe it.
        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;
        // Explanation: Trying to cast a String to an int at runtime results in a ClassCastException.

        // Step 14
        // The above example is different from the code block below.
        // Uncommenting the next line will result in a compilation error.
        // int three = (int) "three"; // Error: incompatible types
        // Explanation: Attempting to cast a String literal to an int causes a compilation error.

        // Step 15
        // The two different types of errors observed are:
        // 1. The first one is a compilation error because you can't cast a String to an int directly.
        // 2. The second one is a runtime error (ClassCastException) because you can't cast an Object to an int if it doesn't reference an actual integer.

        // Step 16
        // Shorthand assignment operators
        int x1 = 4;
        x1 += 5; // Equivalent to x1 = x1 + 5;

        int x2 = 3;
        int y2 = 4;
        y2 *= x2; // Equivalent to y2 = y2 * x2;

        int x3 = 10;
        int y3 = 2;
        x3 /= y3; // Equivalent to x3 = x3 / y3;
        y3 -= x3; // Equivalent to y3 = y3 - x3;
        // Explanation: Demonstrating shorthand assignment operators.
    }
}
