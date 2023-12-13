public class MethodsLecture {

    public static void main(String[] args) {

    }

//    Defining Methods
//    - Methods are similar to functions, meaning it is built to perform a specific task
//    - Similar to functions in JS, methods accept parameters and produce an output

//    Basic Syntax:
//    public static returnType methodName([param1[, param2[, ...]]) {
    // the statements of the method
    // a return statement, if a return type is declared
//    }

//        * public: is the visibility modified
//            - shows that this method can be accessed by code outside of the class
//        * static:
//            - When declared it states the method belongs to the class rather than a specific instance.
//            - Meaning it can be called without creating an instance of the class.
//            - Allows a method, to be called before an object of the class is created,
//            - Static Methods can: access static data directly & call other static methods only
//
//        * returnType:
//            - THis is the return type of the method
//            - All methods must define the type of the value they will return
//            - If there is no return, use the special keyword 'void'

//        * methodName
//            - The name of the function/method

//        * param1:
//             Parameters the method accepts
//            - A method can have no parameters, one parameters, or multiple parameters.
//            - Must include the type that specifies each parameter.
//            * Everything inside the curly braces is the body of the method.
//
//        - When building methods, they will need to be on the outside of the main method.

//    Example:
//     Example of no parameter

    public static String startingApplication() {
        return "Starting my application";
    }

//        example with 2 parameters

//    public static String sayHello(String greeter, String name) {
//        return greeter + " " + name;
//    }

//    Create a method that takes in two numbers and return the sum of the numbers,Name the method addingNums

    public static int addingNums(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
//    you do. Create a method that takes in two parameters, the first one is a name and the second parameter is the age, it should return name + age. Name the method birthday.

    public static String birthday(String name, int age){
    return name + age;
    }

    public static void count(int n){
        System.out.println(n);
        count(n-1);
    }
}