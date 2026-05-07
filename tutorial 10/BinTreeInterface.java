// KIT107 Lab 10: BinTreeInterface
/**
 * Specification for the Binary Tree ADT
 *
 * @author Julian Dermoudy
 */

public interface BinTreeInterface
{
    //public BinTree();
    //public BinTree(Object o);
    public boolean isEmpty();
    public Object getData() throws EmptyBinTreeException;
    public BinTree getLeft() throws EmptyBinTreeException;
    public BinTree getRight() throws EmptyBinTreeException;
    public void setData(Object o) throws EmptyBinTreeException;
    public void setLeft(BinTree l) throws EmptyBinTreeException;
    public void setRight(BinTree r) throws EmptyBinTreeException;
    public int height();
    public String toString();
}