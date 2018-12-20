import java.util.HashSet;
/*
 * 
 * This will test to see if 2 numbers in an array 
 * add up to a designated sum. If the designated sum 
 * is 8: 1+7, 2+6, 3+5, 4+4, 0+8, -1+9,,,,,,
 */
public class SetTest 
{
	// This method determines if two integers in an array
	// sum to a designated sum. Checks to see if the intger
	// is in the HashSet, if so true, else store the compliment.
	public static boolean MeetsSum(int[] x, int sum)
	{
		HashSet set = new HashSet<Integer>();
		for(int i = 0; i < x.length; i++)
		{
			if(set.contains(x[i]))
			{
				return true;
			}
			else
			{
				set.add(sum-x[i]); // Adds the compliment to the HashSet
			}
		}
		return false;
	} //MeetsSum

	public static void main(String[] args) 
	{
		int sum = 8;
		int [] a = {1, 2, 4, 9};
		int [] b = {1, 2, 4, 4};
		boolean addToEight = MeetsSum(a, sum);
		System.out.println("It is " + addToEight + " that there are two numbers that has a sum of 8");
		addToEight = MeetsSum(b, sum);
		System.out.println("It is " + addToEight + " that there are two numbers that has a sum of 8");
		
	} //main

}
