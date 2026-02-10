public class Book 
{
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    
    public Book() 
    {
        title = "Unknown";
        author = "Unknown";
        isbn = "0000000000";
        available = true;
    }
    public Book(String title, String author, String isbn) 
    {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        available = true;
    }

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
}
