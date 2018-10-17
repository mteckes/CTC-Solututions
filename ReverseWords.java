
import java.util.Stack;


public class ReverseWords 
{

	public static void main(String[] args) 
	{
		// This program will reverse the individual words in the string
		// and keep their order
		
		String temp = "moo cow bark dog";
		String tempReversed = new String();
		int theStackCapacity = 0;
		
		Stack theStack = new Stack();
		for(int i = 0; i < temp.length(); i++)
		{
			theStack.push(temp.charAt(i));
			theStackCapacity++;
		}
		
		
		System.out.println("The Capacity: " + theStackCapacity);
		String tempWord = ""; // Temp string variable to hold 1 word
		
		for(int i = 0; i < theStackCapacity; i++)
		{
			
			if(theStack.peek().equals(' ')) // If the top element is a space
			{
				tempWord = theStack.pop() + tempWord; // Pop the space and put it in front of the word
				tempReversed = tempWord + tempReversed; // Put the completed word in front
				tempWord = ""; // Reset the temp string to null
			}
			else
			{
				tempWord = tempWord + theStack.pop(); // Pop off letters and add to the rear
			}
			if(i == theStackCapacity-1) // this will put the last word in the front
			{
				tempReversed = tempWord + tempReversed;
			}
			
		}
		
		System.out.println("The Orginal String: " + temp);
		System.out.println("The Reversed String: " + tempReversed);
		
		
		

	}

}
