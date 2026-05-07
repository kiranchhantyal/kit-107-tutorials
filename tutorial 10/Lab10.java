// KIT107 Lab 10: Driver file
/**
 * Harness class for Lab 10
 * 
 * @author Julian Dermoudy
 */

public class Lab10
{
	public static void main(String []args)
	{
		BinTree t;
		BinTree x,y,z;
			
		t=new BinTree("A");
		System.out.println("Installing A as the root...");
		x=new BinTree("B");		
		System.out.println("Installing B as A's left branch...");
		t.setLeft(x);

		y=new BinTree("C");
		System.out.println("Installing C as A's right branch...");
		t.setRight(y);
			
		z=new BinTree("F");
		System.out.println("Installing F as C's right branch...");
		y.setRight(z);
			
		y=new BinTree("D");
		System.out.println("Installing D as B's left branch...");
		x.setLeft(y);

		z=new BinTree("E");
		System.out.println("Installing E as B's right branch...");
		x.setRight(z);
			
		x=new BinTree("G");
		System.out.println("Installing G as E's left branch...");
		z.setLeft(x);

		System.out.println("\nThe tree has " + t.height() + " level(s).");
			
		System.out.println("Tree: \n" + t.toString());
	}
}
