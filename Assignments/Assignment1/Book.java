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
    //getters
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
    //setters
    public void setTitle(String title) 
    {
        if (!title.equals("")) 
        {
            this.title = title;
        }
    }

    public void setAuthor(String author) 
    {
        if (!author.equals("")) 
        {
            this.author = author;
        }
    }

    public void setIsbn(String isbn) 
    {
        if (isbn.length() == 10 || isbn.length() == 13) 
        {
            this.isbn = isbn;
        }
    }

    public void setAvailable(boolean available) 
    {
        this.available = available;
    }
}
