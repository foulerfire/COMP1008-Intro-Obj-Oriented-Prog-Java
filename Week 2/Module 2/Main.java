
/*
    Week 2: Module 2 Learning Activity - Practice Shell
    Concepts to Practice:
    - Variables & Constants
    - if / if…else / nested if
    - switch statements
    - while and for loops
    - Increment (++) / Decrement (--) / Compound Assignment (+=, -=)
    - Typecasting
*/
import java.util.Scanner;

class Student {
    // STEP 1: Declare instance variables
    String name;
    int id;
    String program;
    int gradeLevel;
    double gpa;
 
 
    // STEP 2: Declare a constant (final)
final double MIN_GPA = 0;
 
    // STEP 3: Method to display student info
    void displayInfo() {
        // TODO: Print all fields
        System.out.println("\n---Student Info---");
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("program: "+ program);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Gpa: "+ gpa);
    }
 
 
    // STEP 4: Conditional statements (if…else)
        
        // TODO: Use if…else to check GPA ranges
    void checkGPA() {
        if(gpa >= 3.5){
            System.out.println((name) + "This is an honor student");
;        }else if(gpa >=2.0){
        System.out.println(name + "Has a passing gpa");
        } else{
            System.out.println("Student needs improvement");
        }

    }
 
     // STEP 5: Nested if example
    void checkProgram() {
        // TODO: Nested if for program and GPA
        if(program.equalsIgnoreCase(" computer science")){ //ignores differences in upper case and lower case while comparing
             if(gpa >= 3.5){
                System.out.println(name + " is eligble for CS scholarship");
             } else{
                System.out.println(name + " is not eligible for CS Scholarship");
             }
        }

    }
 
 
    // STEP 6: Switch statement example
    void gradeDescription() {
        // TODO: Use switch to print school type based on gradeLevel
        switch(gradeLevel){
            case 1: case 2: case 3:
            System.out.println(name + " is in elementary school");
            break;
            case 4: case 5: case 6:
            System.out.println(name + " is in middle school");
            break;
            case 7: case 8: case 9:
            System.out.println(name + " is in junior high school");
            break;
            case 10: case 11: case 12:
            System.out.println(name + " is in high school");
            break;
            default:
                System.out.println(" Invalid grade level");
        }
    }
 
 
    // STEP 7: While loop example
    void printNumbersUpToGPA() {
        // TODO: Use while loop, typecast GPA to int
        int count = 1;

        while(count <= (int)gpa){
            System.out.println(count + " ");
            count++;
        }
        System.out.println();
    }
 //step 7.1 do while loop
 void enterGPAs(){
    Scanner input = new Scanner(System.in);
    double gpaInput;
    do{
        System.out.println("enter semester GPA press - 1 to stop");
        gpaInput = input.nextDouble();
        if(gpaInput != -1){
            System.out.println("recorded GPA : " + gpaInput);
        }
    }while(gpaInput != -1);
        System.out.println("all semesters gpa are recorded");
 }
 
    // STEP 8: For loop example
    void printMultiplesOfID() {
        // TODO: Use for loop to print multiples of ID
        for (int i =1; i <= 5; i++){
            System.out.println(id * i + " ");
        }
        System.out.println();
    }
 //step 8.1 enchance for loop: used to loop through arrays and objections easily
 ///for(dataType variable : arrayName){}
     void printSemesterGPA(){
        double[] semesterGPA = {3.0,3.5,3.7};
        System.out.println("Semester gpas");
        for(double g : semesterGPA){
            System.err.print(g + " ");
        }
        System.out.println();
    }   

 
    // STEP 9: Increment / Decrement / Compound assignment example
    void updateGPA() {
        // TODO: Demonstrate ++, --, +=, -= with GPA
        System.err.println("original GPA:" + gpa);
        gpa++;//gpa=gpa +1
        System.out.println("Updated GPA-after incrementy" + gpa);
        gpa += 0.5;
        System.out.println("Updated GPA-after compund addition assignment" + gpa);
        gpa--;
        System.out.println("Updated GPA-after decrement" + gpa);
        gpa =- 0.2;
        System.out.println("Updated GPA-after decrement assignment" + gpa);

    }
}
 
 
 
// MAIN CLASS
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
 
        System.out.println("==== Week 2: Module 2 Learning Activity ====");
 
 
        // STEP 1: Create a Student object
        Student s1 = new Student();
 
 
        // STEP 2: Assign values to fields (or use Scanner input)
        s1.name = "matt";
        s1.id = 101;
        s1.program = "computer science";
        s1.gradeLevel = 5;
        s1.gpa = 4.2;
 
        // STEP 3: Call methods to practice all concepts
      s1.displayInfo();
      s1.checkGPA();
      s1.checkProgram();
      s1.gradeDescription();
      s1.printNumbersUpToGPA();
      s1.printMultiplesOfID();
      s1.printSemesterGPA();
      s1.enterGPAs();
      s1.updateGPA();
    }
}
 
    

