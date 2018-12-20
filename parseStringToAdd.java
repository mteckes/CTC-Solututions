/*
 * 
 * This Program will parse a string to do a mathamatical 
 * calculation. Assume the only operators are "+" or "-".
 * Given a string, do the calculation.
 * 
 * 
 * Given "1+3+100-38"
 * Should output 66
*/

public class parseStringToAdd 
{
	// This method will talk a string, parse it to create
	// an integer, and the add them all up. Then it will
	// Return the total.
	public static int doCalculation(String toCalculate)
	{
		int total = 0;
		String tempString = "";
		boolean toSubtract = false;
		char tempChar;
		
		for(int i = 0; i< toCalculate.length(); i++)
		{
			tempChar = toCalculate.charAt(i); // assign the character at that index to temp variable
			
			if((tempChar == '+' || tempChar == '-') && i > 0 ) // will know when to calculate and start the next string
			{
				total += Integer.parseInt(tempString); // parse converts the string to the integer
				tempString = ""; // Reset string
				
			}
			
				tempString += tempChar;
			
		}
		total += Integer.parseInt(tempString); // account for the last string
		return total;
	}
	
	
	public static void main(String [] args)
	{
		// Test Case 1, end with subtraction/negative number
		String stringToCalculate = "1+3+100-38";
		int finalTotal = doCalculation(stringToCalculate);
		System.out.println("The final total is: " + finalTotal);
		
		// Test casee 2, start with negative number
		stringToCalculate = "-1+4-18+100";
		finalTotal = doCalculation(stringToCalculate);
		System.out.println("The final total is: " + finalTotal);
		
		// Test case 3, negative numbers back to back
		stringToCalculate = "-10-5+100-25";
		finalTotal = doCalculation(stringToCalculate);
		System.out.println("The final total is: " + finalTotal);
	}
}
