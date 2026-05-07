/**
 * Class to represent empty Queue errors
 * 
 * @author Julian Dermoudy
 */
 
class EmptyQueueException extends RuntimeException
{
	public EmptyQueueException()
	{
		super("Cannot access a component of an empty queue...");
	}
}
