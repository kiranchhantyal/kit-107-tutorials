// KIT107 Lab 10: BinTree
/**
 * Implementation of the BinTree ADT using DBTNodes
 *
 * @author <<Your name and student ID>>
 */

public class BinTree implements BinTreeInterface
{
	// final variable
	protected final boolean ITERATION = true;	// iterative solution if true, recursive solution if false

	// non-final instance variable
	protected DBTNode root;		// 'way-in' to root node of the BinTree

	/**
	* Constructor -- empty BinTree
	*/
	public BinTree()
	{
		root=null;
	}

	/**
	* Constructor -- singleton BinTree
	* @param o object to put in leaf node
	*/
	public BinTree(Object o)
	{
		root=new DBTNode(o);
	}

	/**
	* Check for emptiness
	* @return true if binary tree is empty, false otherwise
	*/
	public boolean isEmpty()
	{
		return (root == null);
	}

	/**
	* Find root value in binary tree
	* @return object at root of binary tree
	*/
	public Object getData() throws EmptyBinTreeException
	{
		if (isEmpty())
		{
			throw new EmptyBinTreeException();
		}
		
		return root.getData();
	}
		
	/**
	* Find reference to left sub-tree of binary tree
	* @return reference to left of binary tree
	*/
	public BinTree getLeft() throws EmptyBinTreeException
	{  
		BinTree l;
		
		if (isEmpty())
		{
			throw new EmptyBinTreeException();
		}
			
		l = new BinTree();
		l.root = root.getLeft();        

		return l;
	}
	
	/**
	 * Find reference to left sub-tree of binary tree
	 * @return reference to left of binary tree
	*/
	public BinTree getRight() throws EmptyBinTreeException
	{
		BinTree r;
		
		if (isEmpty())
		{
			throw new EmptyBinTreeException();
		}
			
		r = new BinTree();
		r.root = root.getRight();        

		return r;
	}
	
	/**
	 * Update data field of root node
	 * @param o object to be stored in data field of root node
	*/
	public void setData(Object o) throws EmptyBinTreeException
	{
		if (isEmpty())
		{
			throw new EmptyBinTreeException();
		}
  
		root.setData(o);
	}
	
	/**
	 * Update left field of root node
	 * @param l reference to binary tree to be inserted as left branch of root node
	*/
	public void setLeft(BinTree l) throws EmptyBinTreeException
	{
		if (isEmpty())
		{
			throw new EmptyBinTreeException();
		}
  
		root.setLeft(l.root);
	}
	
	/**
	 * Update right field of root node
	 * @param r reference to binary tree to be inserted as right branch of root node
	*/
	public void setRight(BinTree r) throws EmptyBinTreeException
	{
		if (isEmpty())
		{
			throw new EmptyBinTreeException();
		}
  
		root.setRight(r.root);
	}

	/**
	* Find height of binary tree (empty tree has height 0)
	* @return int height of binary tree
	*/
	public int height()
	{
		BinTree l;	// left sub-tree
		BinTree r;	// right sub-tree
		int lh;	// height of left sub-tree
		int rh;	// height of right sub-tree
		
		
		// otherwise...
			// get left sub-tree
			// get right sub-tree
			// calculate height of left sub-tree
			// calculate height of right sub-tree
			// if the height of the left sub-tree exceeds the height of the right
				// result is height of the left sub-tree plus 1, return it
			// otherwise...
				// result is height of the right sub-tree plus 1, return it
	}
		
	/**
	* Decorate each node in the tree with its left-to-right node number (label)
	* @param n latest numeric label assigned to a node (i.e. starting point)
	* @return int last label number assigned
	*/
	public int decorate(int n)
	{
		BinTree l;	// left sub-tree
		BinTree r;	// right sub-tree
			
		n=0;  // DELETE ME AND IMPLEMENT THE ALGORITHM BELOW
		
		// if tree isn't empty
			// get left sub-tree
			// get right sub-tree

			// decorate left sub-tree and update result (n)
				
			// label current node with n
			// increment label variable n

			// decorate right sub-tree and update result (n)
			
		// return next label value to be used, n
		return n;
	}
	
	/**
	* Perform breadth-first traversal to pretty-print specific level of binary tree
	* @param n number of level to be processed (root level is 1)
	* @param w current distance from left-hand edge of screen (in characters)
	* @return String printable format of specified level of the tree
	*/
	protected String levelToString(int n, int w)
	{
		BinTree l;	// left sub-tree
		BinTree r;	// right sub-tree
		String s;	// final result
			
		s="";

		if (!isEmpty())
		{	
			if (n==1)
			{
				// this is the level we want so display the node
				s=root.toString(w);
			}
			else
			{
				// this isn't the level we want, so keep going down...
				l=getLeft();
				r=getRight();
				s=l.levelToString(n-1,w);
				s+=r.levelToString(n-1,w+s.length());
			}
		}
		
		return s;
	}	

	/**
	* Perform breadth-first traversal to pretty-print binary tree using a for loop by level
	* @return String printable format of the tree
	*/
	protected String toStringV1()
	{
		String s;	// result

		s="";

		// label each node with its left-to-right number starting at 1
		decorate(1);

		//display the tree one level at a time with blank space
		for (int i=1; i<=height(); i++)
		{
			// pretty-print level i starting 0 characters from left-hand edge
			s+=levelToString(i,0);
			s+="\n";
		}

		// return the result
		return s;
	}

	/**
	* Perform breadth-first traversal to pretty-print binary tree using a Queue
	* @param s currently built-up result to which we'll add 'output'
	* @param q the queue of sub-trees that we are yet to visit
	* @return String printable format of the tree
	*/
	protected String toStringV2(String s, Queue q)
	{
		BinTree t;	// tree from queue
		BinTree l;	// left branch of current tree
		BinTree r;	// right branch of current tree

		// if the current tree isn't empty
			// work out how many characters are in the string since the 'last' newline character (\n), and then print the node
			s = root.toString(s.length()-s.lastIndexOf('\n')-1);

			// obtain the left branch of the current tree
			// if the left branch isn't an empty tree
				// add the left branch to the queue

			// obtain the right branch of the current tree
			// if the right branch isn't an empty tree
				// add the right branch to the queue

		// if the queue isn't empty, use it to work out where to go, and go there
			// get the head of the queue, assign it to t, and remove it from the queue

			// if the value of the current tree's decoration > than that of t... 
				// add a new line (\n) to s

			// continue processing by recursive call on t passing in s and q and adding the result to s

		// return the result
		return s;
	}

	/**
	* Perform breadth-first traversal to pretty-print binary tree
	* @return String printable format of the tree
	*/
	public String toString()
	{
		String s;	// final result
		Queue q;	// intermediate Queue used in Version 2

		q=new Queue();	// create the empty queue of Trees to visit
		s="";	// initialise the result

		// label each node with its left-to-right number starting at 1
		decorate(1);

		// if the tree has nodes in it...
		if (! isEmpty())
		{
			// produce printable format of the tree in either iterative or recursive manner
			s=(ITERATION)?toStringV1():toStringV2(s,q);
		}

		// return result
		return s;			
	}
}