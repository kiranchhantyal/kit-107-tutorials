/**
 * Specification for the Queue ADT
 * 
 * @author Julian Dermoudy
 */

public interface QueueInterface
{
    //public Queue();
    //public Queue(Object o);
    public boolean isEmpty();
    public void add(Object o);
    public Object front() throws EmptyQueueException;
    public void remove() throws EmptyQueueException;
    public String toString(); 
}