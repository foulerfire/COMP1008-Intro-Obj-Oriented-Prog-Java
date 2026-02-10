import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        int choice = 0;

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

            // Validate menu input 
            choice = 0;
            while (choice < 1 || choice > 7) 
            {
                System.out.print("Choose an option (1–7): ");
                choice = input.nextInt();
                input.nextLine();
            }

            switch (choice) 
            {

                case 1:
                    String title = "";
                    while (title.equals("")) 
                    {
                        System.out.print("Enter title: ");
                        title = input.nextLine();
                    }

                    String author = "";
                    while (author.equals("")) 
                    {
                        System.out.print("Enter author: ");
                        author = input.nextLine();
                    }

                    String isbn = "";
                    while (!(isbn.length() == 10 || isbn.length() == 13)) 
                    {
                        System.out.print("Enter ISBN (10 or 13 characters): ");
                        isbn = input.nextLine();
                    }

                    books.add(new Book(title, author, isbn));
                    System.out.println("Book added.");
                    break;

                case 2:
                    for (Book b : books) 
                    {
                        b.displayInfo();
                    }
                    break;

                case 3:
                    for (Book b : books) 
                    {
                        if (b.isAvailable()) 
                        {
                            b.displayInfo();
                        }
                    }
                    break;

                case 4:
                    String searchAuthor = "";
                    while (searchAuthor.equals("")) 
                    {
                        System.out.print("Enter author name: ");
                        searchAuthor = input.nextLine();
                    }

                    for (Book b : books) 
                    {
                        if (b.getAuthor().equalsIgnoreCase(searchAuthor)) 
                        {
                            b.displayInfo();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter ISBN to check out: ");
                    String checkoutIsbn = input.nextLine();
                    boolean foundCheckout = false;

                    for (Book b : books) 
                    {
                        if (b.getIsbn().equals(checkoutIsbn) && b.isAvailable()) 
                        {
                            b.setAvailable(false);
                            System.out.println("Book checked out.");
                            foundCheckout = true;
                        }
                    }

                    if (!foundCheckout) 
                    {
                        System.out.println("Book not found or already checked out.");
                    }
                    break;

                case 6:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = input.nextLine();
                    boolean foundReturn = false;

                    for (Book b : books) 
                    {
                        if (b.getIsbn().equals(returnIsbn) && !b.isAvailable()) 
                        {
                            b.setAvailable(true);
                            System.out.println("Book returned.");
                            foundReturn = true;
                        }
                    }

                    if (!foundReturn) 
                    {
                        System.out.println("Book not found or already available.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    break;
            }
        }

        input.close();
    }
}
