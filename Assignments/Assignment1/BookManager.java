import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    public static void main(String[] args) 
    {
          // scanner used for all input
        Scanner input = new Scanner(System.in);
        // Array to store multiple books
        ArrayList<Book> books = new ArrayList<>();

        int choice = 0;
        // main menu loop
        while (choice != 7) 
        {

            System.out.println("\nLibrary Menu");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books");
            System.out.println("3. Display available books");
            System.out.println("4. Search books by author");
            System.out.println("5. Check out a book");
            System.out.println("6. Return a book");
            System.out.println("7. Exit");

            // validate menu input 
            choice = 0;
            while (choice < 1 || choice > 7) 
            {
                System.out.print("Choose an option (1-7): ");
                choice = input.nextInt();
                input.nextLine();
            }
            // switch statement for menu choices
            switch (choice) 
            {
                // add a new book 
                case 1:
                     
                     // validate that title isnt empty
                    String title = "";
                    while (title.equals("")) 
                    {
                        System.out.print("Enter title: ");
                        title = input.nextLine();
                    }
                     // validate that author isnt empty
                    String author = "";
                    while (author.equals("")) 
                    {
                        System.out.print("Enter author: ");
                        author = input.nextLine();
                    }
                    // validate isbn length is right length
                    String isbn = "";
                    while (!(isbn.length() == 10 || isbn.length() == 13)) 
                    {
                        System.out.print("Enter ISBN (10 or 13 characters): ");
                        isbn = input.nextLine();
                    }
                    // create new book and add it to array
                    books.add(new Book(title, author, isbn));
                    System.out.println("-----------------------");
                    System.out.println("Book added.");
                    System.out.println("-----------------------");
                    break;
                // display all books in system
                case 2:
                    for (Book b : books) 
                    {
                        b.displayInfo();
                    }
                    break;
                // display only books currently available
                case 3:
                    for (Book b : books) 
                    {
                        if (b.isAvailable()) 
                        {
                            b.displayInfo();
                        }
                    }
                    break;

                // search for books by author name 
                case 4:
                    String searchAuthor = "";
                    // validate ethat author nam isnt empty
                    while (searchAuthor.equals("")) 
                    {
                        System.out.print("Enter author name: ");
                        searchAuthor = input.nextLine();
                    }
                    
                    // loop through array and show matching books
                    for (Book b : books) 
                    {
                        if (b.getAuthor().equalsIgnoreCase(searchAuthor)) 
                        {
                            b.displayInfo();
                        }
                    }
                    break;
                // check out book using isbn
                case 5:
                    System.out.print("Enter ISBN to check out: ");
                    String checkoutIsbn = input.nextLine();
                    boolean foundCheckout = false;
                    // search for matching book and update availability
                    for (Book b : books) 
                    {
                        if (b.getIsbn().equals(checkoutIsbn) && b.isAvailable()) 
                        {
                            b.setAvailable(false);
                            System.out.println("-----------------------");
                            System.out.println("Book checked out.");
                            System.out.println("-----------------------");
                            foundCheckout = true;
                        }
                    }
                    // no valid book was found
                    if (!foundCheckout) 
                    {
                        System.out.println("-----------------------");
                        System.out.println("Book not found or already checked out.");
                        System.out.println("-----------------------");
                    }
                    break;
                // return a checked out book with isbn
                case 6:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = input.nextLine();
                    boolean foundReturn = false;
                    // search for book and update availability
                    for (Book b : books) 
                    {
                        if (b.getIsbn().equals(returnIsbn) && !b.isAvailable()) 
                        {
                            b.setAvailable(true);
                            System.out.println("-----------------------");
                            System.out.println("Book returned.");
                            System.out.println("-----------------------");
                            foundReturn = true;
                        }
                    }
                    // no valid book was found
                    if (!foundReturn) 
                    {
                        System.out.println("Book not found or already available.");
                    }
                    break;

                case 7:
                    // exit program
                    System.out.println("Exiting program.");
                    break;
            }
        }
        input.close();
    }
}
