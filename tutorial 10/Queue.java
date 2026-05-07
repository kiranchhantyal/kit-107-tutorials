/**
 * Implementation for Queue using linked-list
 * 
 * @author Julian Dermoudy
 */

public class Queue implements QueueInterface
{
	protected Node head;

	/**
 	* Constructor for empty Queue
 	*/
	 public Queue()
	 {
		 head = null;
	 }
 
	/**
 	* Constructor for singleton Queue
 	*/
	 public Queue(Object o)
	 {
		 head = new Node(o);
	 }
 
	  /**
	* Check for emptiness
	* @return true if Queue is empty, false otherwise
	*/
	public boolean isEmpty()
	{
		// queue is empty if linked-list is empty
		return (head == null);
	}

	/**
	* Find first item in Queue
	* @return value at front of Queue
	*/
	public Object front() throws EmptyQueueException
	{
		if (isEmpty())
		{
			throw new EmptyQueueException();
		}
		
		// return data item of first node
		return head.getData();
	}

	/**
	* Remove front item from Queue
	*/
	public void remove() throws EmptyQueueException
	{
		if (isEmpty())
		{
			throw new EmptyQueueException();
		}
		else
		{
			// advance the head reference variable to whatever comes next
			head = head.getNext();
		}
	}

	/**
	* Add item to Queue
	* @param o value to be added to Queue
	*/
	public void add(Object o)
	{
		Node n;	// node to add
		Node c;	// current node

		// create new node
		n = new Node(o);

		if (isEmpty())
		{
			// empty linked list so new node will be all there is
			head = n;
		}
		else
		{
			// not empty and so traverse to the final node
			c = head;
			while (c.getNext() != null)
			{
				c = c.getNext();
			}

			// append the new node
			c.setNext(n);
		}
	}

	/**
	* Find printable form of queue
	* @return String form of queue for printing etc.
	*/
	public String toString()
	{
		Node c;		// current node
		String s;	// result -- with contents within <> and items separated by commas
		
		if (isEmpty())
		{
			// empty
			s = "<>";
		}
		else
		{
			// traverse the linked-list adding each item's printable form to the result
			s = "<";
			c = head;
			while (c != null)
			{
				s += c.getData().toString();
				c = c.getNext();
				if (c != null)
				{
					// not the last item so add the separator
					s += ",\n ";
				}
			}
			s += ">";
		}

		return s;
	}
}