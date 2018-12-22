/*
 * This program will find the nth node from the end on a 
 * single LinkedList. Firstly, it will create nodes, fill the
 * LinkedList, and then find the nth from the last node.
 */
public class nthFromEndNode 
{

	// This method will take in a node to be a head
	// and then populate it with nodes for a LinkedList
	public static void fillLinkedList(node x)
	{
		node tempHead = x;

		for(int i = 1; i < 16; i++)
		{
			node n = new node(i); // Fills int data in node w/ i's int value

			if(tempHead.next == null) // Add not to head first
			{
				tempHead.next = n;
			}

			while(tempHead.next != null) // Walk LinkedList to get to the end
			{
				if(tempHead.next == null)
				{
					tempHead.next = n; // Add node to the end of the LinkedList
				}
				tempHead = tempHead.next; // Walks to the next node
			}

		}

	} // fillLinkedList



	//This method will print out the LinkedList
	public static void printLinkedList(node x)
	{
		node tempHead = x;
		tempHead = tempHead.next; // Omits the head from being printed

		while(tempHead.next != null) // Walks the list to print
		{
			System.out.print(tempHead.data + " | ");
			tempHead = tempHead.next;
		}

		if(tempHead.next == null && tempHead != null) // Prints out the last node
		{
			System.out.print(tempHead.data + " | ");
			tempHead = tempHead.next;
		}

	} // printLinkedList



	// This method will find the nth number from
	// the end node. 
	public static void findNode(node x, int numFromEnd)
	{
		node tempHead = x;
		node nodePtrSlow = tempHead;
		node nodePtrFast = tempHead;

		if(tempHead.next != null) // Make sure tempHead is not empty
		{
			for(int i = 0; i < numFromEnd-1; i++) // Move faster pointer ahead
			{
				nodePtrFast = nodePtrFast.next;
			}

			while(nodePtrFast.next != null) // Walks the list to get to the end
			{
				nodePtrSlow = nodePtrSlow.next;
				nodePtrFast = nodePtrFast.next;
			}

			if(nodePtrFast.next == null && nodePtrFast != null) // Moves to the last node, and then prints nodePtrSlow
			{

				System.out.println("\nThe node is: " + nodePtrSlow.data );

			}


		} // if()


	} // findeNode

	public static void main (String [] args)
	{

		// Test Case 1
		node head = new node();
		int nthFromLast = 3;
		fillLinkedList(head);
		printLinkedList(head);
		findNode(head, nthFromLast);

		// Test Case 2
		head = new node();
		nthFromLast = 5;
		fillLinkedList(head);
		printLinkedList(head);
		findNode(head, nthFromLast);


	}
}
