
import java.util.Stack;


public class ReverseWords 
{

	public static void main(String[] args) 
	{
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
		String tempWord = "";
		
		for(int i = 0; i < theStackCapacity; i++)
		{
			
			if(theStack.peek().equals(' '))
			{
				tempWord = theStack.pop() + tempWord;
				tempReversed = tempWord + tempReversed;
				tempWord = "";
			}
			else
			{
				tempWord = tempWord + theStack.pop();
			}
			if(i == theStackCapacity-1)
			{
				tempReversed = tempWord + tempReversed;
			}
			
		}
		
		System.out.println("The Orginal String: " + temp);
		System.out.println("The Reversed String: " + tempReversed);
		
		
		

	}

}
