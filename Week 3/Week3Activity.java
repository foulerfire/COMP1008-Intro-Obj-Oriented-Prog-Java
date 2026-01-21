import java.util.Scanner;

/*
    Week 3 Comprehensive Program: Methods, Logical Operators & Enums
    Covers:
    - Static and instance methods
    - Methods with multiple parameters
    - Method overloading
    - Logical operators (&&, ||, !)
    - Method call stack and activation records
    - Using return values
    - Enum types
*/

public class Week3Activity {

    // STEP 0: Enum for Days (or Game Choices)
    enum Choice {
        ROCK, PAPER, SCISSORS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Week 3: Methods, Logical Operators & Enums Demo ====");

        // STEP 1: Call a method to greet the user
        greetUser();

        // STEP 2: Call a method that adds two numbers
        int sum = addNumbers(5, 7);
        System.out.println("Sum: " + sum);

        // STEP 3: Call a method that multiplies two numbers
        int product = multiplyNumbers(4, 6);
        System.out.println("Product: " + product);

        // STEP 4: Check if a number is positive and even
        boolean result = isPositiveAndEven(10);
        System.out.println("Is 10 positive and even? " + result);

        // STEP 5: Call overloaded methods
        displayInfo();
        displayInfo("John");
        displayInfo("John", 25);

        // STEP 6: Enum usage demo
        Choice userChoice = Choice.ROCK;
        Choice computerChoice = Choice.SCISSORS;

        showChoice(userChoice);
        showChoice(computerChoice);

        // STEP 7: Method call stack demo
        int finalResult = sumAndMultiply(3, 5);
        System.out.println("Sum and Multiply Result: " + finalResult);

        scanner.close();
    }

    // STEP 1: Method to greet the user
    public static void greetUser() {
        System.out.println("Welcome! Let's explore methods and enums.");
    }

    // STEP 2: Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // STEP 3: Method to multiply two numbers
    public static int multiplyNumbers(int x, int y) {
        return x * y;
    }

    // STEP 4: Check if number is positive and even
    public static boolean isPositiveAndEven(int n) {
        return n > 0 && n % 2 == 0;
    }

    // STEP 5: Overloaded methods
    public static void displayInfo() {
        System.out.println("No information provided.");
    }

    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // STEP 6: Method using enum
    public static void showChoice(Choice choice) {
        System.out.println("Choice selected: " + choice);
    }

    // STEP 7: Method calling other methods (call stack demo)
    public static int sumAndMultiply(int a, int b) {
        int sum = addNumbers(a, b);
        int product = multiplyNumbers(a, b);
        return sum + product;
    }
}
