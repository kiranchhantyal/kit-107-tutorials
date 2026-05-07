/**
 * Specification for singly-linked nodes
 * 
 * @author Julian Dermoudy
 */

public interface NodeInterface
{
    //void Node(Object o);
    public void setData(Object o);
    public void setNext(Node n);
    public Object getData();
    public Node getNext();
}