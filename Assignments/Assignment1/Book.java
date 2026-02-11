public class Book 
{
    // private fields for encapsulation
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    // default constructor for book
    public Book() 
    {
        title = "Unknown";
        author = "Unknown";
        isbn = "0000000000";
        available = true;
    }
    
    // parameterized constructor so validation applied
    public Book(String title, String author, String isbn) 
    {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        available = true;
    }
    //getters for all fields
    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public String getIsbn() 
    {
        return isbn;
    }

    public boolean isAvailable() 
    {
        return available;
    }
    //setters for daata control
    public void setTitle(String title) 
    {
        if (!title.equals("")) 
        {
            this.title = title;
        }
    }
    // checks that author name isn't empty before setting
    public void setAuthor(String author) 
    {
        if (!author.equals("")) 
        {
            this.author = author;
        }
    }
    // isbn must be 10 or 13 characters long
    public void setIsbn(String isbn) 
    {
        if (isbn.length() == 10 || isbn.length() == 13) 
        {
            this.isbn = isbn;
        }
    }
    // used when checking out or returning a book
    public void setAvailable(boolean available) 
    {
        this.available = available;
    }
    //display all book info
    public void displayInfo() 
    {
        System.out.println("----------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}
