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
}
