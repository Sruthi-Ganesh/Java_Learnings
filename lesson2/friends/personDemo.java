
/**
 * Write a description of class personDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class personDemo
{
   public static void main(String[]  args)
    {
        person sara = new person("sara","download.jpg",10,200);
        person chenghan = new person("Cheng-Han","download.jpg",300,0);
        person cay =  new person("cay","download.jpg",250,180);
        ReduceColor color = new ReduceColor(244,322,105);
        color.reduce();
        System.out.println(color.getRed() );
        System.out.println(color.getGreen()); 
        System.out.println(color.getBlue());
        
        sara.addFriend(cay);
        sara.addFriend(chenghan);
        sara.makeMutualFriends(chenghan);
    }
}