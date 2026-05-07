/**
 * Implementation of the binary tree node
 * 
 * @author Julian Dermoudy
 */

public class BTNode implements BTNodeInterface
{
	protected Object data;
	protected BTNode left;
	protected BTNode right;

	/**
	 * Constructor
	 * @param o object to be stored into BTNode
	*/
	public BTNode(Object o)
	{
		data=o;
		left=null;
		right=null;
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
	 * Update left field
	 * @param n reference to be stored in left field of node
	*/
	public void setLeft(BTNode n)
	{
		left=n;
	}
	
	/**
	 * Update right field
	 * @param n reference to be stored in right field of node
	*/
	public void setRight(BTNode n)
	{
		right=n;
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
	 * Find object stored in left field
	 * @return object stored in left field of node
	*/
	public BTNode getLeft()
	{
		return left;
	}
		
	/**
	 * Find object stored in right field
	 * @return object stored in right field of node
	*/
	public BTNode getRight()
	{
		return right;
	}
}
