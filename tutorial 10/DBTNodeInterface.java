// KIT107 Lab 10: Decorated Binary Tree Node
/**
 * Specification for the DBTNode ADT
 *
 * @author Julian Dermoudy
 */
 
public interface DBTNodeInterface
{
    //public DBTNode(Object o);
    public void setData(Object o);
    public void setLabel(int l);
    public void setLeft(DBTNode l);
    public void setRight(DBTNode r);
    public Object getData();
    public int getLabel();
    public DBTNode getLeft();
    public DBTNode getRight();
    public String toString(int w);
}