
public class Node 
{
    Book data;          
    Node next;   
    
    //Default constructor
    public Node()
    {
        data = null;
        next = null;
    }
   
    //Normal constructor
    public Node(Book data)
    {
        this.data = data;
        next = null;
    }
    
    public Node(Book data, Node next)
    {
        this.data = data;
        this.next = next;
    }
   
    //Update data
    public void setData(Book newData)
    {
        data = newData;
    }
    
    //Update the reference to the next node
    public void setNext(Node newNext)
    {
        next = newNext;
    }
   
    //To get the data
    public Book getData()
    {
        return data;
    }
    
    //To get the next data
    public Node getNext()
    {
        return next;
    }

    //To print
    public String toString()
    {
        if (next == null)
            return data.toString() + "";
        else 
            return data.toString() + "," + next.toString();
    }
    
}
