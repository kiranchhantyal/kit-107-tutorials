/**
 * Implementation of singly-linked nodes
 * 
 * @author Julian Dermoudy
 */
 
public class Node implements NodeInterface
{
	private Object data;
	private Node next;

	/**
	 * Constructor
	 * @param o object to be stored in node
	*/
	public Node(Object o)
	{
		data=o;
		next=null;
	}

	/**
	 * Update data field
	 * @param o object to be stored in data field of node
	*/
	public void setData(Object o)
	{
		data=o;
	}
	
	/**
	 * Update next field
	 * @param n reference to be stored in next field of node
	*/
	public void setNext(Node n)
	{
		next=n;
	}

	/**
	 * Find object stored in data field
	 * @return object stored in data field of node
	*/
	public Object getData()
	{
		return data;
	}

	/**
	 * Find object stored in next field
	 * @return reference to node in next field of node
	*/
	public Node getNext()
	{
		return next;
	}
}
