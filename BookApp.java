import java.util.*;

public class BookApp
{
    public static void main(String[] args)
    {
        double discount,mean;
        double total = 0;
        int count = 0;
        //arraylist
        ArrayList booklist = new ArrayList(100);
        
        //linkedlist
        LinkedList AddisonList = new LinkedList();
        LinkedList ExpensiveList = new LinkedList();
        
        Scanner s = new Scanner(System.in);
        
        //user input
        for(int i=0 ; i < booklist.getMaxSize() ; i++)
        {
            System.out.println("Enter the book title : ");
            String title = s.nextLine();
            //s.nextLine();
            System.out.println("Enter the publisher : ");
            String publisher = s.nextLine();
            System.out.println("Enter the book price : ");
            double price = Double.parseDouble(s.nextLine());
            System.out.println("Enter the year published : ");
            int year = s.nextInt();
            System.out.println();
            s.nextLine();
            
            Book b = new Book(title,publisher,price,year);
            
            total += price;
            
            booklist.insertAt(i,b);
            
        }
        
        //display the list
        System.out.println("List of books : ");
        for(int j = 0; j < booklist.getMaxSize();j++)
        {
            Object obj = booklist.getData(j);
            Book c = (Book) obj;
            
            
            System.out.println("Title : " +c.getTitle());
            System.out.println("Publisher : " +c.getPublisher());
            System.out.println("Price : " +c.getPrice());
            System.out.println("Year published : " +c.yearPublished());
            
            discount = 0.20;
            System.out.println("Price after discount : " +c.priceAfterDiscount(discount));
            System.out.println();
        }
        
        
        //searching book title My First Java course
        for(int i = 0; i < booklist.getMaxSize();i++)
        {
               Object obj = booklist.getData(i);
               Book b1 = (Book) obj;
            
                if(b1.getTitle().equalsIgnoreCase("My First JAVA course"))
                {
                System.out.println("Title : " +b1.getTitle());
                System.out.println("Publisher : " +b1.getPublisher());
                System.out.println("Price : " +b1.getPrice());
                System.out.println("Year published : " +b1.yearPublished());
                
               }
            
                else if(!b1.getTitle().equalsIgnoreCase("My First JAVA course"))
               {
                System.out.println("Sorry, the book you entered not found in the list");
                booklist.removeAt(i);
                }
            
        }
        
        //find average price
        mean = averagePrice(total,100);
        System.out.println("The average price of books is " +mean);
        
        //expensive books list
        for(int i=0 ; i < booklist.getMaxSize(); i++)
        {
            Object obj = booklist.getData(i);
            Book b2 = (Book) obj;
            
            if(b2.getPrice() > mean)
            {
                ExpensiveList.addFirst(b2);
                System.out.println("\nExpensive list : ");
                System.out.println(b2.toString());
            }
        }
        
        //Books by Addison Wesley
        for(int i=0 ; i < booklist.getMaxSize(); i++)
        {
            Object obj = booklist.getData(i);
            Book b3 = (Book) obj;
            
            if(b3.getPublisher().equalsIgnoreCase("Addison Wesley"))
            {
                System.out.println("\nBook (By Addison Wesley) : " +b3.getTitle());
                AddisonList.addFirst(b3);
                count++;
            }
            
             else if(!b3.getPublisher().equalsIgnoreCase("Addison Wesley"))
            {
                System.out.println("\nBook title  : " +b3.getTitle());
            } 
           
        }
         System.out.println("Total books by Addison Wesley : " +count++);
       
        //highest price in Addison list 
        Book a = (Book)AddisonList.getFirst();
        Book max = AddisonList.getFirst();
        
        while((a = (Book)AddisonList.getNext()) != null)
        {
            if( max.getPrice() < a.getPrice())
            {    max = a;
                
                System.out.println("The highest book price by Addison Wesley : ");
                System.out.println(a.getTitle());
                System.out.println(a.getPublisher());
                System.out.println(a.getPrice());
                System.out.println(a.yearPublished());
            }
        }
        
        System.out.println("\nHighest Price: \n" + max);
    }
    
    //find average books price
    public static double averagePrice(double total, int n)
    {
        double average=0;
        average = total/n;
        return average;
    }
    
   
    
}
