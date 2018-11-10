import java.util.*;


public class ArrayList
{
    private Object[] data;
    private int length, maxSize;
    
    //Default constructor
    public ArrayList()
    {
        maxSize = 0;
        data = null;
        length = 0;
    }
    //Normal constructor
    public ArrayList(int k)
    {
        maxSize = k;
        data = new Object[maxSize];
        length = 0;
    }
    // Insert an element at the back of the array list
    public void insertEnd(Object k) 
    {
       if(!isFull())
       {
          data[length] = k;
          length = length + 1;
       }else
          throw new ArrayListException("The Array List is full");
    }
    // Insert an element at the front of the array list
    public void insertFront(Object k) 
    {
        insertAt(0,k);
    }
    
    //Insert an element at anywhere of the array list
    public void insertAt(int i, Object k) 
    {
        if(isFull())
           throw new ArrayListException("The Array List is full");
        else if ((i < 0) || (i > length))
           throw new ArrayListException("Index is out of bounds"); 
        else
        {
            
            for(int j = length-1; j >= i; --j)
                data[j + 1] = data[j];
                
            length = length + 1;
            data[i] = k;
            
        }
    }
    
    public int getNum() // Return the number of elements in the array list
    {
        return length;   
    }
    
    public int getMaxSize() // Return the size of the array list
    {
        return maxSize;   
    }
    //Return data at the specified location
    public Object getData(int i) 
    {
       if (isEmpty())
           throw new ArrayListException("The Array List is empty");
        else if((i < 0) || (i > length-1))
           throw new ArrayListException("Index is out of bounds");
            
        return data[i];   
    }
    // Set data at the specified location
    public void setData(int i, Object k) 
    {
        if (isEmpty())
           throw new ArrayListException("The Array List is empty");
        else if((i < 0) || (i > length-1))
           throw new ArrayListException("Index is out of bounds");
        
        data[i] = k;   
    }
    // Remove data at the specified location
    public Object removeAt(int i) 
    {
        if (isEmpty())
           throw new ArrayListException("The Array List is empty");
        else if((i < 0) || (i > length-1))
           throw new ArrayListException("Index is out of bounds");
           
        if ( i == (length-1))
        {
            length = length - 1;
            return data[i];
        }
        
        Object obj = data[i];
        for(int j = i; j < length - 1; ++j)  
        {
            data[j] = data[j+1];
        }
        
        length = length - 1;
        return obj;   
    }
    // Remove the first element
    public Object removeFirst() 
    {
        return removeAt(0);   
    }
    // Remove the last element
    public Object removeLast() 
    {
        return removeAt(length-1);
    }
    
    public void clearList() // Clear all the elements in the Array List
    {
        length = 0;   
    }
    
    public boolean isFull() // Return true if the Array List is not full otherwise return false
    {
        return length == maxSize;   
    }
    
    public boolean isEmpty() // Return true if the Array List is empty otherwise return false
    {
        return length == 0;   
    }
    
    public String print(){ // for displaying the element in the Array List
        String str ="(";
        if (length == 0)
            return "( )";
        else 
        {
            for(int i = 0; i < length; ++i)
                str += data[i]+",";
            return str+")";
        }
    }  
}