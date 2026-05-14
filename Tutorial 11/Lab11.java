// KIT107 Tutorial 11: Lab11
/**
 * Harness
 * 
 * @author Julian Dermoudy
 */

public class Lab11
{
    public static void main(String []args)
    {
        Cirque c;   // the circular queue
        String tasks[]={"sleep","bathe","dress","eat","poop","work"};  // a bunch of Strings
        
        // Create the circular queue with values from the tasks array
        System.out.print("Building cirque...");
        c=new Cirque();    
        for (int i=0; i<tasks.length; i++)
        {
            System.out.print("adding " + tasks[i] + "...");
            c.add(tasks[i]);
        }
        System.out.println("done.\n");
    
        // Display current circular queue and the firt two values
        System.out.println("Cirque is: " + c.toString());
        System.out.println("Current value was: " + c.nextOne());
        System.out.println("Current value was: " + c.nextOne());
    
        // Remove a value
        System.out.println("\nBefore removal cirque is: " + c.toString());
        c.remove();
        System.out.println("After removal cirque is: " + c.toString());
    
        // Examine the first 13 values (of the 5 present!)
        System.out.print("\nThe first thirteen items are: ");
        for (int i=1; i<=12; i++)
        {
            System.out.print(c.nextOne() + ", ");
        }
        System.out.println(c.nextOne() + ".");
        
        System.out.println("\nCirque is: " + c.toString());
    }
}