import java.util.ArrayList;
import java.util.Scanner;

public class BookManager 
{

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

            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) 
            {

                case 1:
                    System.out.print("Enter title: ");
                    String title = input.nextLine();

                    System.out.print("Enter author: ");
                    String author = input.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = input.nextLine();

                    Book newBook = new Book(title, author, isbn);
                    books.add(newBook);

                    System.out.println("Book added.");
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    break;
            }
        }

        input.close();
    }
}
