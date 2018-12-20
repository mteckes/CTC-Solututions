import java.util.Stack;
/*
 * Write code to reverse a C-Style String
 */

public class QuestionTwo 
{
	// This method will reverse a C-Style String using a Stack
	public static char[] reverseString(char[] temp)
	{
		Stack tempStack = new Stack();
		int i = 0;
		// This will push all the characters onto the stack
		while(temp[i] != '\0')
		{
			tempStack.push((char)temp[i]);
			i++;
		}
		
		
		int j = 0;
		// This method will pop the characters from the stack
		// and put it into the C-Style String
		while(j < temp.length-1)
		{
			temp[j] = (char) tempStack.pop();
			j++;
		}
		
		
		return temp;
	} // reverseString
	
	
	public static void main(String[] args)
	{
		char[] tempWord = {'a', 'b', 'c', 'd', '\0'};
		System.out.println(tempWord);
		reverseString(tempWord);
		System.out.println(tempWord);
	} // main
}
