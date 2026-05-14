/**
 * Interface to specify doubly-linked nodes
 * 
 * @author Julian Dermoudy
 */
 
public interface DNodeInterface
{
    //public DNode(Object o);
	public void setData(Object o);
	public void setNext(DNode n);
	public void setPrev(DNode n);
	public Object getData();
	public DNode getNext();
	public DNode getPrev();
}