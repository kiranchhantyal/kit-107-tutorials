// KIT107 Lab 10: Decorated Binary Tree Node
/**
 * Implementation for the DBTNode ADT
 * 
 * @author Julian Dermoudy
 */

public class DBTNode extends BTNode implements DBTNodeInterface 
{
	protected int label;

	/**
	* Update label field
	* @param l int to be stored in label field of dbtnode
	*/
	public void setLabel(int l)
	{
		label=l;
	}
				
	/**
	* Find value stored in label field
	* @return int value stored in label field of dbtnode
	*/
	public int getLabel()
	{
		return label;
	}

	/**
	* Perform pretty-printing of decorated binary tree node
	* @param int w current distance from left-hand edge of screen (in characters)
	* @return String of printable form of DBTNode contents
	*/
	public String toString(int w)
	{
		String r;	// node value to return 
		int l;		// label indicating how much indentation to apply
		
		r="";
		l=getLabel();
			
		//indent 3 spaces for each 'missing' node from current place (w) on line
		for (int i=w; i<(l-1)*3; i++)
		{
			// add "   " for each node on the left of this one
			r+=" ";
		}
			
		// display the node contents
		r+=(String)getData();// + "("+w+")";
			
		return r;
	}

	/**
	* Constructor -- needed because Java won't automatically call constructors
	* 				 from a parent class if the parameter list is non-empty
	* @param o value to be stored into DBTNode
	*/
	public DBTNode(Object o)
	{
		super(o);	// call the parent class constructor
		label = 0;
	}

	// The remainder of this file are 'wrapper' methods that simply call the
	// inherited method from the super (parent) class.  These are needed
	// because the DBTNodeInterface demands them...  It would have been
	// easier just to skip the methods in the interface and just declare the
	// new ones.  Then from here down could all be deleted.
	/**
	 * Update left field
	 * @param n reference to be stored in left field of node
	*/
	public void setLeft(DBTNode n)
	{
		super.setLeft(n);
	}

	/**
	 * Update right field
	 * @param n reference to be stored in right field of node
	*/
	public void setRight(DBTNode n)
	{
		super.setRight(n);
	}
	
	/**
	 * Find object stored in left field
	 * @return object stored in left field of node
	*/
	public DBTNode getLeft()
	{
		return (DBTNode) super.getLeft();
	}
		
	/**
	 * Find object stored in right field
	 * @return object stored in right field of node
	*/
	public DBTNode getRight()
	{
		return (DBTNode) super.getRight();
	}
}
