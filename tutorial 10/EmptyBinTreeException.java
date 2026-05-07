/**
 * Class to represent empty BinTree errors
 * 
 * @author Julian Dermoudy
 */
 
class EmptyBinTreeException extends RuntimeException
{
	public EmptyBinTreeException()
	{
		super("Cannot access a component of an empty binary tree...");
	}
}
