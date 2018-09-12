
/**
 * Used for testing the Book class
 * Homework for APCS
 * <a href = "https://docs.google.com/document/d/1T5v3OLQYWF8X9UDa9H0vEmmZZX7Pk62oqDT8kszIxlo/edit?usp=sharing" 
 *   target="_blank">Assignment details</a>
 *
 * @author Michael Buescher
 * @version 2018-09
 */
public class BookTest
{

    public static void main (String[] args)
    {
        Book b1 = new Book ("To Kill a Mockingbird", "Harper Lee", 281, 1960);
        Book b2 = new Book ("1984", "George Orwell", 268, 1949);

        System.out.println (b1);
        System.out.println (b2);
        System.out.println ();    // print a blank line
        
        b1.setCurrentPage(20);
        b2.setCurrentPage(25);
        
        System.out.println (b1.getTitle() + " currently on page " + b1.getCurrentPage() + ".");
        System.out.println (b2.getTitle() + " currently on page " + b2.getCurrentPage() + ".");
         
        b1.setCurrentPage(200);
        b2.setCurrentPage(300);
        
        System.out.println ();    // print a blank line
        System.out.println (b1.getTitle() + " currently on page " + b1.getCurrentPage() + ".");
        System.out.println (b2.getTitle() + " currently on page " + b2.getCurrentPage() + ".");
        
    }
}
