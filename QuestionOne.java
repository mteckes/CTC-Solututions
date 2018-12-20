import java.util.HashSet;
/*
 * This program checks to see if a string has all unique characters.
 */
public class QuestionOne 
{
	// This method walks a string to check if it already exists
	// in a string by using a HashSet. If the character is not
	// in the set, the character is added. If it is already in the 
	// set, returns false.
	public static boolean uniqueChar(String temp)
	
	{
		HashSet theChar = new HashSet<String>();
		for(int i = 0; i < temp.length(); i++)
		{
			if(theChar.contains(temp.charAt(i))) // Already exists in the set
			{
				return false;
			}
			else
			{
				theChar.add(temp.charAt(i)); // Add to the set
			}
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) 
	{
		String a = "hello";
		String b = "rainbow";
		boolean tOrF = uniqueChar(a);
		System.out.println("It is " + tOrF + " that the string " + a + " has unique characters.");
		tOrF = uniqueChar(b);
		System.out.println("It is " + tOrF + " that the string " + b + " has unique characters.");
		
	}

}
