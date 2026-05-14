/**
 * Specification for the Circular Queue ADT
 * 
 * @author Julian Dermoudy
*/

public interface CirqueInterface
{
    //public Cirque();
    //public Cirque(Object o);
    public boolean isEmpty();
    public void add(Object o);
    public void remove() throws EmptyCirqueException;
    public Object nextOne() throws EmptyCirqueException;
    public String toString(); 
}