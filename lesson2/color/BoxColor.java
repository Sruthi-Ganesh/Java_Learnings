
/**
 * Write a description of class BoxColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoxColor
{
    // instance variables - replace the example below with your own
    public static void main(String [] args)
    {
        Rectangle rect = new Rectangle(10,20,10,10);
        rect.setColor(new Color(255,0,255));
        rect.fill();
    }
}
