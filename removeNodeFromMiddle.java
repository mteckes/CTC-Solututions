/*
 * This program will remove a node from the middle of a single
 * LinkedList with only a pointer at the middle node. 
 * a->b->c->d->e should look like a->b->d->e. The pointer
 * will start at node c
 * 
 */
public class removeNodeFromMiddle 
{


	// This method will take in a node to be a head
	// and then populate it with nodes for a LinkedList
	public static void fillLinkedList(node x)
	{
		node tempHead = x;

		for(int i = 1; i < 6; i++)
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

		} // end for()

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


	// This method will remove the middle node from the LinkedList
	// with only the node being passed as the pointer. 
	public static void removeMiddleNode(node tempHead)
	{

		while(tempHead.next != null)
		{
			tempHead.data = tempHead.next.data; // Copies the next node's data
			if(tempHead.next.next == null) // Removes the last node
			{
				tempHead.next = null;
			}
			else
			{
				tempHead= tempHead.next; // Move to the next node
			}
		}
	}



	public static void main (String [] args)
	{
		node head = new node(); // Create a node for the head of a LinkedList
		fillLinkedList(head); // Fill the LinkedList with nodes
		System.out.println("Here is the list before removal");
		printLinkedList(head);
		node toSolve = head.next.next.next; // Creating the pointer for the question
		removeMiddleNode(toSolve);
		System.out.println("\nHere is the list:");
		printLinkedList(head);


	}
}
