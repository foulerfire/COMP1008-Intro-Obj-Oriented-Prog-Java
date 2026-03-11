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

        // email validation

        // ask user to enter email
        String email;

        while (true) {

            System.out.print("Enter email: ");
            email = scanner.nextLine();

            // validate email format
            if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {

                System.out.println("Valid email");
                break;

            } else {
                System.out.println("Invalid email.");

            }
        }

        // sentence processing

        // ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // count vowels
        int vowelCount = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                vowelCount++;

            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        // reverse sentence
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println("Reversed sentence: " + sb.reverse());

        // replace all digits in sentence with *
        String replacedSentence = sentence.replaceAll("\\d","*");

        System.out.println("Digits replaced: " + replacedSentence);

        // tokenizing

        // create course list
        String courses = "Math,Science,Java,English";

        // split string by comma
        String[] courseArray = courses.split(",");

        System.out.println("Courses:");

        for (String course : courseArray) {
            System.out.println(course);
        }




    }
}