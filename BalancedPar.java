import java.util.Stack;

public class BalancedPar 
{
	// This method checks all balances
	public static boolean isBalancedAllBrackets(String str)
	{
		Stack holdBraces = new Stack(); // Will store parentheses, braces, and brackets
		// Check if the string is empty
		if(str.length() == 0)
		{
			return true;
		}

		// This will check the rest of the string
		else
		{
			for(int i = 0; i < str.length(); i++ )
			{
				char tempChar = str.charAt(i); // Temp Value to hold character at index
				//System.out.println("The Char is "+ tempChar);

				// If right facing brace, push onto the stack
				if(tempChar == '(' || tempChar == '{' || tempChar == '[')
				{
					holdBraces.push(tempChar);
				}

				// The the temp Char is ")" then pop off stack
				else if(tempChar == ')') 
				{
					char temp = (char)(holdBraces.pop());

					if(temp == '{' || temp == '[')
					{
						return false;
					}
				}

				else if(tempChar == ']') 
				{
					char temp = (char)(holdBraces.pop());

					if(temp == '{' || temp == '(')
					{
						return false;
					}
				}

				else if(tempChar == '}') 
				{
					char temp = (char)(holdBraces.pop());

					if(temp == '(' || temp == '[')
					{
						return false;
					}
				}
			}
			return true;
		}

	}

	// This method checks for balanced parentheses
	public static boolean isBalanced(String str)
	{
		int Balanced = 0;
		boolean isBalanced = true;

		// Check if the string is empty
		if(str.length() == 0)
		{
			return true;
		}
		// If string is not empty
		else
		{
			for(int i = 0; i < str.length(); i++)
			{
				if(str.charAt(i) == '(')
				{
					Balanced ++;
				}
				if(str.charAt(i) == ')')
				{
					Balanced--;
					if(Balanced < 0)
					{
						return false;
					}
				}
			}
			return true;
		}
	}

	public static void main(String[] args) 
	{
		String tempStringBal = "(())()((()()))";
		String tempStringUnBal = "())(()";
		String temp1 = "{a+(9-1)*b}";
		String temp2 = "{a*b(x+[c)+9]}";
		boolean tOF = isBalanced(tempStringBal);

		System.out.println("String 1 is "+ tOF + " that is is balanced");
		tOF = isBalanced(tempStringUnBal);
		System.out.println("String 2 is "+ tOF + " that is is balanced");


		tOF = isBalancedAllBrackets(temp1);
		System.out.println("String 3 is "+ tOF + " that is is balanced");
		tOF = isBalancedAllBrackets(temp2);
		System.out.println("String 4 is "+ tOF + " that is is balanced");

	}

}
