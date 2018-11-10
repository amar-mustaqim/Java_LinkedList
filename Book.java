
public class Book
{
    private String title;
    private String publisher;
    private double price;
    private int yearPublished;
    
    //default constructor
    public Book()
    {
        title = "";
        publisher = "";
        price = 0;
        yearPublished = 0;
    }
    
    //normal constructor
    public Book(String t, String p, double pr, int y)
    {
        title =t;
        publisher =p;
        price = pr;
        yearPublished = y; 
    }

    //setter
    public void setBook(String t, String p, double pr, int y)
    {
        title = t;
        publisher = p;
        price = pr;
        yearPublished = y; 
    }
    
    //getter
    public String getTitle()
    {
        return title;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int yearPublished()
    {
        return yearPublished;
    }
    
    //
    public String toString()
    {
      return("Title : " +getTitle() + "\nPublisher : " +getPublisher() +"\nPrice : " +getPrice() + "\nYear Published : " +yearPublished());
    }
    
    //processor
    public double priceAfterDiscount(double rate)
    {
        return price = price - (price*rate);
    }
}
