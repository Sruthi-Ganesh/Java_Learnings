import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class friends here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class friends
{
    // instance variables - replace the example below with your own
    private int n;
    private static ArrayList<String> friends,friendOfFriends;
    private static ArrayList<Integer> numberOfFriends;

    /**
     * Constructor for objects of class friends
     */
    public friends()
    {
        // initialise instance variables
        
    }

    public static void main(String[] args)

    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String friend = in.nextLine();
        friends.add(friend);
        int number = in.nextInt();
      
        
        for(int i=0;i<number;i++)
        {
        String friends = in.nextLine();
        friendOfFriends.add(friends);
    }
    
    System.out.println(friends.toString()+ friendOfFriends.toString());
        
}
}
