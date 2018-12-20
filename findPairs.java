/*
 * This program will find all pairs that sum to a designated number
 * and prints them out. Firstly sorts the data, and then finds the 
 * value that would match to sum to the designated number. Assume no other 
 * data structures can be used.
 */

public class findPairs
{

	// This method will merge sort the int array

	public static void merge(int[]A, int beg, int mid, int end)
	{
		// Create left and right sub arrays from where we merge the data
		int[] left = new int [mid - beg + 1];
		int [] right = new int[end - (mid+1) + 1];
		// Then copy the elements from A[] into left[] and right[]
		int i, j, k;
		for(i = beg, j=0; i <=mid; i++, j++)
		{
			left[j] = A[i];

		}
		for(i = mid+1, j=0; i<= end; i++, j++)
		{
			right[j] = A[i];
		}

		// The actual merging will happen next
		for(i = beg, j = 0, k= 0; i<=end && j< left.length && k< right.length; i++)
		{
			// Check between the left and right arrays first available elements
			if(left[j] <= right[k])
			{
				A[i] = left[j];	// Choose the smaller element, or from the left if equal
								// Increment the counter to point to next available
				j++;
			}
			else
			{
				A[i] = right[k];
				k++;
			}

		}
		//Using the following loop, we can store elements of one sub-array, when the 
		// other is exhausted
		
		for(; i<= end; i++)
		{
			//Check if the left array has any elements remaining
			if(j != left.length)
			{
				A[i] = left[j];	// copy all the remaining elements
				j++;
			}
			//otherwise, check if the right array has any elements remaining
			else
			{
				A[i] = right[k];	// Copy the remaining from right
				k++;
			}
		}

	} // merge

	public static void mergeSort(int[]A, int beg, int end)
	{
		int mid;
		if(beg<end)
		{
			mid = beg+(end -beg )/2;
			//recursively call mergerSort
			mergeSort(A, beg, mid);		//Call mergeSrot on the left half
			mergeSort(A, mid+1, end);	//Call mergeSoret on the right half
			merge(A, beg, mid, end);	//Call merge to combine the elements
		}
	} // mergeSort

	public static void mergeSort(int[] A)
	{
		mergeSort(A, 0, A.length - 1);	//We need to send the beginning 
		// and end indices along with the reference
	}
	
	// This method will be used to search for a value
	public static int bubbleSearch (int [] tempDataSet, int tempSearchValue, int low, int high)
	{


		int mid = low + high/2 - low/2;

		if(tempDataSet[mid] == tempSearchValue)
		{
			return mid;
		}
		if(tempDataSet[mid] > tempSearchValue)
		{
			high = mid-1;
			return bubbleSearch(tempDataSet, tempSearchValue, low, high);
		}
		if(tempDataSet[mid] < tempSearchValue)
		{
			low = mid+1;
			return bubbleSearch(tempDataSet, tempSearchValue, low, high);
		}
		else
		{
			return -1;
		}
		//return mid;
	} // end bubbleSearch


	// This method will find the pairs that will add to a specific value
	public static void findPairs(int[] dataSet, int addValue)
	{
		if(dataSet.length == 0)
		{
			System.out.println("The dataSet is empty");

		}
		if(dataSet.length == 1)
		{
			System.out.println("No Pairs Exist");

		}
		else
		{
			boolean containsNoPairs = true;
			int lowPointer = 0;
			int highPointer = dataSet.length - 1;
			// while the pointers haven't converged, loop
			while(lowPointer != highPointer)
			{
				
				//if the index at the low and high pointers are equal to the value you are looking for
				if( (dataSet[lowPointer] + dataSet[highPointer]) == addValue)
				{
					System.out.println(""+dataSet[lowPointer] + " + " + dataSet[highPointer] + " == " + addValue);
					containsNoPairs = false;
					lowPointer++;
					//highPointer--;
				}
				else
				{
					if( (dataSet[lowPointer] + dataSet[highPointer]) > addValue)
					{
						highPointer--;
					}
					if((dataSet[lowPointer] + dataSet[highPointer]) < addValue)
					{
						lowPointer++;
					}
					
				}
			} // end while




			if(containsNoPairs == true)
			{
				System.out.println("No pairs exist!");
			}
		} // end else
		
	} // findPairs

	public static void main (String [] args)
	{
		int [] dataSet = {-1, 2,0,3,4,1,7,5,9}; // data set
		int addValue = 8;
		mergeSort(dataSet);
		for(int i = 0; i < dataSet.length; i++)
		{
			System.out.print(dataSet[i] + ", ");
		}
		System.out.println();
		findPairs(dataSet, addValue);

	} // main

}	