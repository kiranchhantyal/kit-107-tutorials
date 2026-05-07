/**
 * Interface for Binary Tree Node
 * 
 * @author Julian Dermoudy
 */
 
public interface BTNodeInterface
{
	//public BTNode(Object o);
	public void setData(Object o);
	public void setLeft(BTNode n);
	public void setRight(BTNode n);
	public Object getData();
	public BTNode getLeft();
	public BTNode getRight();
}
