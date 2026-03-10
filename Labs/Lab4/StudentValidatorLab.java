import java.util.*;
import java.util.regex.*;

public class StudentValidatorLab {

public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // name validation
        // ask user to enter full name
        String name;
        // name loop to make sure a valid entry happens before moving forward
        while (true) {

            System.out.print("Enter full name: ");
            name = scanner.nextLine();

            // validate name making sure only letters and spaces used
            if (name.matches("[A-Za-z ]+")) {

                System.out.println("Valid name");
                break;  // exit loop if input valid

            } else {

                System.out.println("Invalid name. Letters and spaces only.");

            }
        }

        // student ID validation with format S-1234
        
        // ask user to enter student ID
        String studentId;

        while (true) {

            System.out.print("Enter student ID (S-1234): ");
            studentId = scanner.nextLine();
           
            // validate format with regex
            if (studentId.matches("S-\\d{4}")) {

                System.out.println("Valid student ID");
                break;

            } else {

                System.out.println("Invalid format. Must be S-1234");

            }
        }

        