
//STARTER CODE
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        // Step 1: Create TextFields for input
        TextField input1 = new TextField();
        TextField input2 = new TextField();
 
        // Step 2: Create Buttons for operations
        Button addBtn = new Button("+");
        Button subBtn = new Button("-");
        Button mulBtn = new Button("*");
        Button divBtn = new Button("/");
 
        // Step 3: Create Label for result
        Label resultLabel = new Label("Result: ");

        // Step 4: HBox for buttons
        HBox buttonLayout = new HBox(10);
        buttonLayout.getChildren().addAll(addBtn, subBtn, mulBtn, divBtn);

        // Step 5: VBox main layout
        VBox mainLayout = new VBox(10);
        mainLayout.getChildren().addAll(input1, input2, buttonLayout, resultLabel);

        // Step 6: Event handling for buttons
        // ADD
        addBtn.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                resultLabel.setText("Result: " + (num1 + num2));
            } catch (Exception ex) {
                resultLabel.setText("Invalid input!");
            }
        });


        // SUBTRACT
        subBtn.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                resultLabel.setText("Result: " + (num1 - num2));
            } catch (Exception ex) {
                resultLabel.setText("Invalid input!");
            }
        });


        // MULTIPLY
        mulBtn.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                resultLabel.setText("Result: " + (num1 * num2));
            } catch (Exception ex) {
                resultLabel.setText("Invalid input!");
            }
        });


        // DIVIDE
        divBtn.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());


                if (num2 == 0) {
                    resultLabel.setText("Error: Division by zero");
                } else {
                    resultLabel.setText("Result: " + (num1 / num2));
                }


            } catch (Exception ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        // Step 7: Create scene and show stage
        Scene scene = new Scene(mainLayout, 300, 200);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
 
//TASKS TO COMPLETE(SUBMIT SCREENSHOTS FOR ALL TASKS)
 
//TODO:Enter numbers in the two TextFields.
 
//TODO:Click any operation button to see the result in the Label.
 
//TODO:Test for division by zero. 
 
//TODO:Try entering invalid input (letters) and observe program behavior (optional: you can handle exceptions for invalid input).
 
EXPECTED OUTPUT:
Example 1:
 
Input1: 10
Input2: 5
Click '+'
Result: 15.0
 
 
Example 2:
 
Input1: 8
Input2: 0
Click '/'
Result: Error: Division by zero
 
 
Example 3:
 
Input1: 7
Input2: 3
Click '*'
Result: 21.0