import java.util.ArrayList;
import java.util.Arrays;
 
public class Lab4 {
    public static void main(String[] args) {
 
        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
 
        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        // ================================================
        String[] groceries = 
        {
            // TODO: Fill in your grocery items
            "Oranges",
            "Cheese",
            "Milk",
            "Eggs",
            "Bread",
            "Candy"
        };
 
 
        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
        System.out.println("Grocery Array:");
        System.out.println(Arrays.toString(groceries));
 
 
        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();
 
        // TODO: Loop through the array and add items to groceryList
        for (int i = 0; i < groceries.length; i++) 
        {
            groceryList.add(groceries[i]);
        }
 
 
        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        // Remove one item by name or index
        // Print the updated ArrayList
        // ================================================
        groceryList.add("Ice Cream");
        groceryList.add("Potato");

        groceryList.remove("Candy"); // remove by name

        System.out.println("\nUpdated Grocery List:");
        System.out.println(groceryList);
 
  
        // ================================================
        // STEP 5: Count how many items start with a vowel
        // Hint: vowels = a, e, i, o, u
        // Use .toLowerCase(). startsWith()
        // ================================================
        int vowelCount = 0;

        for (int i = 0; i < groceryList.size(); i++) {
            String item = groceryList.get(i).toLowerCase();

            if (item.startsWith("a") || item.startsWith("e") || item.startsWith("i") || item.startsWith("o") || item.startsWith("u")) 
                {
                    vowelCount++;
                }
        }
 
 
        // ================================================
        // STEP 6: Print the final results
        // ================================================
        
 
    }
}
 