/*
 * Design an algorithm and write code to remove the duplicat
 * characters in a string without using any additional buffer.
 * NOTE: One or two additional variables are fine. An extra 
 * copy of the array is not.
 */
public class QuestionThree 
{
	// This method will find duplicate and remove them
	// Assumes C-Style String. Any duplicates will be 
	// replace by a null character.
	public static char[] removeDups(char[] temp)
	{
		// Replaces duplicates with '\0'
		for(int i = 0; i < temp.length; i++)
		{
			for(int j = i+1; j < temp.length; j++)
			{
				if(temp[i] == temp[j])
				{
					temp[j] = '\0';
				}
			} // inner for loop
			
		} // outter for loop
		
		
		// Moves nulls to the end of the char[]
		for(int i = 0; i < temp.length; i++)
		{
			for(int j = 0; j < temp.length -1; j++)
			{
				if(temp[j] == '\0')
				{
					char tempChar = temp[j+1];
					temp[j+1] = temp[j];
					temp[j] = tempChar;
				}
			}// inner for loop
			
		}// outter for loop
		
		return temp;
	} // removeDups

	public static void main (String[] args)
	{

		// Test case 1
		String tempString1 = "banana";
		System.out.println(tempString1);
		char[] StringToChar = tempString1.toCharArray(); // Convert String to char[]
		removeDups(StringToChar);
		System.out.println(StringToChar);
		
		
		// Test case 2
		tempString1 = "calooifornia";
		System.out.println(tempString1);
		StringToChar = tempString1.toCharArray(); // Convert String to char[]
		removeDups(StringToChar);
		System.out.println(StringToChar);
		

	} // main
}
