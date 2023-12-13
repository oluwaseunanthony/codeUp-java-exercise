import java.util.Scanner;

public class StringLec {
    public static void main(String[] args){

        String message = "Hello";
        System.out.println(message);
        message = message + "World!";
        System.out.println(message);


        String day ="wednesday";
        String day2 ="wednesday";
        System.out.println(day == day2);


        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ")
        String userInput = sc.next();

// Don't do this!
        boolean confirmation = userInput == "y";


//        ```java
// DON'T DO THIS
        if ("I am a string" == "I am a string") {
            System.out.println("Strings are equal");
        }
//```

    /*    But in general we cannot rely on that behavior, and should use either the
`equals` or `equalsIgnoreCase` method on a string object to compare string
        values.*/

//```java
// Do this instead!
        if ("I am a string".equals("I am a string")) {
            System.out.println("Strings are equal");
        }


    }
}
