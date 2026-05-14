/**
 * Class to represent empty Circular Queue errors
 * 
 * @author Julian Dermoudy
 */
 
class EmptyCirqueException extends RuntimeException
{
	public EmptyCirqueException()
	{
		super("Cannot access a component of an empty circular queue...");
	}
}
