
public class node 
{
	
	// Default Constructor
	public node()
	{
		next = null;
		previous = null;
		data = 0;
	}
	
	// Non-default constructor, fills
	// data field with an int
	public node(int value)
	{
		next = null;
		previous = null;
		data = value;
	}
	
	// Data members
	public node next;
	public node previous;
	public int data;
	
	
	
	
}
