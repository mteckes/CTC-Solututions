import java.util.HashMap;


public class nthDisplay 
{
	// This method will print out the nth occurrence in a list, and if the 
	// number of occurrences is less than n, it will print the first occurrence
	// Takes in a string array and an int for the occurrence number
	public static void printNth(String[] str, int n)
	{
		HashMap countOccurences = new HashMap();
		HashMap refCount = new HashMap();

		// Check if the list is empty
		if(str.length == 0)
		{
			System.out.println("Error!!! The List is empty.");
		}

		// Walk and count all items in the list
		for(int i = 0; i < str.length; i++)
		{
			int tempCount = 0; 

			// Check if the string is already in the hashMap, used to increment value
			if(countOccurences.containsKey(str[i]))
			{
				tempCount = (int)(countOccurences.get(str[i])); // Temp variable to increase the value
			}

			countOccurences.put(str[i] , tempCount + 1); // Add to the hash map and update value
		}

		// Walk the list again to print nth term
		for(int i = 0; i < str.length; i++)
		{
			int tempCount = 0;

			// Check if the string is already in the HashMap, used to increment value
			if(refCount.containsKey(str[i]))
			{
				tempCount = (int)(refCount.get(str[i])); // Temp variable to increase the value
			}
			
			refCount.put(str[i], tempCount + 1);// Add to the hash map and update value

			// Compares if the current string value meets the nth term
			// or if the string is the first occurrence because the number of 
			// Occurrences is less than the n (nth term)
			if((int) refCount.get(str[i]) == n || ( (int)(refCount.get(str[i])) == 1 && (int)(countOccurences.get(str[i])) < n)   )
			{
				String tempString = str[i];
				System.out.print(tempString + ", " );
			}
		}

	}


	public static void main(String[]args)
	{
		int n = 2;
		String[] stringArray1 = {"foo", "bar", "bar", "foo", "book", "foo", "bar"};
		printNth(stringArray1, n);

	}
}
