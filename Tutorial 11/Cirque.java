/**
 * Implementation for Circular Queue using doubly-linked-list
 * 
 * @author <<Your name>>
 */

public class Cirque implements CirqueInterface
{
	protected DNode cursor;	// way in to linked-list

	/**
 	* Constructor for empty Cirque
 	*/
	public Cirque()
	{
		cursor = null;
	}
 
	/**
 	* Constructor for singleton Cirque
 	*/
	public Cirque(Object o)
	{
		cursor = new DNode(o);
		cursor.setNext(cursor);
		cursor.setPrev(cursor);
	}
 
	/**
	* Check for emptiness
	* @return true if Cirque is empty, false otherwise
	*/
	public boolean isEmpty()
	{
		return (cursor == null);
	}

	/**
	* Add item to Cirque
	* @param o value to be added to Cirque
	*/
	public void add(Object o)
	{
COMPLETE ME!
	}

	/**
	* Remove current item from Cirque selecting the next one
	*/
	public void remove() throws EmptyCirqueException
	{
		if (isEmpty())
		{
			throw new EmptyCirqueException();
		}
COMPLETE ME!
	}

	/**
	* Return current item from Cirque selecting the next one
	*/
	public Object nextOne() throws EmptyCirqueException
	{
		if (isEmpty())
		{
			throw new EmptyCirqueException();
		}
COMPLETE ME!
	}

	/**
	* Find printable form of Cirque
	* @return String form of Cirque for printing etc.
	*/
	public String toString()
	{
COMPLETE ME!
	}
}