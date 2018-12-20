import java.util.HashMap;
/*
 * Write a method to decide if 2 strings are anagrams or not
 */
public class QuestionFour 
{

	public static boolean IsAnagram(String tempA, String tempB)
	{
		HashMap mapForComp = new HashMap();
		int count = 0;

		if(tempA.length() == 0 && tempB.length() == 0)
		{
			return true;
		}

		
		for(int i = 0; i < tempA.length(); i++) // Add each character and the total into the map
		{
			mapForComp.put(tempA.charAt(i), count + 1);
		}


		// To remove from the map for comparison
		for(int i = 0; i < tempB.length(); i++)
		{
			if(mapForComp.containsKey(tempB.charAt(i)) == false) // Make sure it exists in the map
			{
				return false;
			}
			
			int tempValueForComp = (int) mapForComp.get(tempB.charAt(i)); // get the value from the map if it exists in the amp
			if(tempValueForComp == 0)
			{
				return false;
			}
			else 
			{
				mapForComp.put(tempB.charAt(i), count - 1); // decrements the number of times in the map
			}

		} // end for


		return true ;
	} // IsAnagram

	public static void main(String[] args) 
	{
		// Test Case 1
		String a = "rear";
		String b = "rare";
		boolean tOrF = IsAnagram(a, b);
		System.out.println("It is " + tOrF + " that " + a + " is an anagram of " + b);

		// Test Case 2
		a = "alone";
		b = "apple";
		tOrF = IsAnagram(a, b);
		System.out.println("It is " + tOrF + " that " + a + " is an anagram of " + b);

		// Test Case 3
		a = "";
		b = "apple";
		tOrF = IsAnagram(a, b);
		System.out.println("It is " + tOrF + " that " + a + " is an anagram of " + b);

	}

}
