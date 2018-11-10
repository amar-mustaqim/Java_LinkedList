public class LinkedList
{
    private Node head, tail, current;

    //Default LinkedList Class
    public LinkedList()
    {
        head = tail = current = null;
    }
    
    //To check whether is the linked list empty
    public boolean isEmpty()
    {
        return head == null;
    }

    //Print data
    public String print()
    {
          
      if (isEmpty())
        return "( )";
      else
       
        return "(" + head + ")";
    }
    
    //To add new Student data at the front of linked list
    public void addFirst(Book data)
    {
        if(isEmpty())
            head = tail = new Node(data);
        else
            head = new Node(data, head);
    }
   
    //To add new Student data at the back of linked list
    public void addLast(Book data)
    {
        if(isEmpty())
            head = tail = new Node(data);
        else
            tail = tail.next = new Node(data);
            
    }
    
    // Return the first element in the linked list 
    public Book getFirst() throws LinkedListException
    {
        if(isEmpty())
            throw new LinkedListException("Error: The linked list is empty.");
        
        current = head;
        return current.data;
    }
   
    // Return the next element in the linked list 
    public Book getNext()
    {
        if(current != tail)
        {
            current = current.next;
            return current.data;
        }
        else
            return null;
            
    }
    
     // Return the last element in the linked list 
    public Book getLast() throws LinkedListException
    {
        if(isEmpty())
            throw new LinkedListException("Error: The linked list is empty.");
            
        return tail.data;
    }
    
    // Remove the first element in the linked list
    public Book removeFirst() throws LinkedListException
    {
        if(isEmpty())
            throw new LinkedListException("Error: The linked list is empty.");
            
        Book d = head.data;
        
        if(head==tail)
            head=tail=null;
        else
        {
            Node curr = head;
            head = head.next;
            curr.next = null;
        }
            
        return d;
        
    }
    
    // Remove the last element in the linked list
    public Book removeLast() throws LinkedListException
    {
        if(isEmpty())
            throw new LinkedListException("Error: The linked list is empty.");
        
        Book d = tail.data;
        
        if(head==tail)
            head=tail=null;
        else
        {
            Node curr = head;
            while(curr.next != tail)
                curr = curr.next;
                
            tail = curr;
            curr.next = null;
        }
            
        return d;
    }
     
     // Return the number of elements in the list
    public int size()
    {
        int count = 0;
        
        if (isEmpty())
            return count;
            
        current = head;
        while(current != null)
        {
            ++count;
            current = current.next;
        }
        
        return count;
    }
   
    //To search Student data
      public boolean contains  ( Book data )  
        {  
            boolean found = false; 
            int count = 0;
            
            Node current = head; 
  
            for  ( int i = 0 ; i <  count && !found; i++ )  
                if  ( current.getData () .equals ( data )  )  
                    found = true; 
                else 
                    current = current.getNext (  ) ; 
  
  
           return found; 
       }  
       
       
       
      
}
