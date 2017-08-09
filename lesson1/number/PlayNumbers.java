
/**
 * Write a description of class PlayNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayNumbers
{
   
    public static void main(String[] args)
    {
       
        System.out.print("My lucky number is");
        System.out.println(3 +4 + 5);
       PlayNumbers no = new PlayNumbers;
        int real=no.sampleMethod(45);
        System.out.println("the value is" + real);
      
    }


    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PlayNumbers
     */
    public PlayNumbers()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
