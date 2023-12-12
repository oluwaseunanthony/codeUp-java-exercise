import java.util.Scanner;

public class ControlStatementsLoops {
    public static void main(String[] args){
//        Boolean Expressions
        System.out.println(10 > 5);
        System.out.println(5 == 5);
        System.out.println(true == false);
        System.out.println();
        System.out.println(2<=2);
//              Logical Operators
        boolean isLoggedIn =true;
        boolean isAdmin =true;

        if(isLoggedIn && isAdmin){
            System.out.println("Admin page");
        }
//        String Comparison
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N]");
        String userInput = sc.next();

        boolean confirmation = userInput.equals("y");

        String firstName = "john";
        String lastName = "john";
        firstName = lastName;

        System.out.println(firstName == lastName);
//        Control Structure

        boolean lectureTime = true;
        if (lectureTime){
            System.out.println("learning something");
        } else {
            System.out.println("this will always run");
        }

        boolean learningJava=true;
        boolean learningJavaScript = false;
        boolean learningHTML=false;

        if(learningJava){
            System.out.println("learning JAVA");
        } else if(learningJavaScript){
            System.out.println("learning JavaScript");
        }else if(learningHTML){
            System.out.println("learning HTML");
        }else if(learningJava){
            System.out.println("learning Java");
        }
        else {
            System.out.println("Learning something else");
        }

        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }






    }

}
