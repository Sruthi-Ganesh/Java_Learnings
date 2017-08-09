
/**
 * Write a description of class CopyingRectangles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyingRectangles
{
    public static void main (String [] args)
    {
        Rectangle box = new Rectangle(5,10,60,90);
        Rectangle box2 = box;
        box.setColor(Color.RED);
        box2.setColor(Color.BLUE);
        box.fill();
    }
}
