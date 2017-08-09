
/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person
{
    
private String name;
private String friends;
public int x,y;
int z;

public person(String aname,String picture,int getx, int gety)
{
    name = aname;
    friends =" ";
    x=getx;
    y=gety;
    Picture pictu = new Picture(picture);
    pictu.translate(getx,gety);
    pictu.draw();
}

public void addFriend(person friend)
{
    friends+=friend.name + " ";
  SmallCircle circle = new SmallCircle(x,y);
   circle.fill();
    Line l = new Line(x,y,friend.x,friend.y);
   l.draw();

}

public void unfriend(person nonfriend)
{
     friends = friends.replace(nonfriend.name+" ", "");
     
    }
    
    public void makeMutualFriends(person friend)
    {
        this.addFriend(friend);
        friend.addFriend(this);
    }

    public String getFriends()
    {
     return friends;
    }
public int getx()
{
    return x;
}
public int gety()
{
    return y;
}
}