import java.util.*;
import java.util.regex.*;

public class StudentValidatorLab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // name validation
        // ask the user to enter full name
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();

        // check that the name only contains letters and spaces
        if (name.matches("[A-Za-z ]+")) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }