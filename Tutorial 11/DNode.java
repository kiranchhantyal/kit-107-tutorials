/**
 * Class to represent doubly-linked nodes
 * 
 * @author Julian Dermoudy
 */
 
public class DNode implements DNodeInterface
{
	protected DNode prev;
	protected Object data;
	protected DNode next;

	/**
	 * Constructor
	 * @param o object to be stored in node
	*/
	public DNode(Object o)
	{
		data=o;
		prev=null;
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
	public void setNext(DNode n)
	{
		next=n;		
	}
	
	/**
	 * Update previous field
	 * @param n reference to be stored in previous field of node
	*/
	public void setPrev(DNode n)
	{
		prev=n;		
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
	public DNode getNext()
	{
		return next;
	}
	
	/**
	 * Find object stored in previous field
	 * @return reference to node in previous field of node
	*/
	public DNode getPrev()
	{
		return prev;	
	}
}