public class ud
{
    public static void main(String [] args)
    {
      Rectangle rec1 = new Rectangle(20,70,40,30);
     rec1.setColor(Color.BLUE);
     rec1.fill();
     Rectangle rec2 = new Rectangle(60,70,40,30);
     rec2.setColor(Color.MAGENTA);
     rec2.fill();
     Rectangle rec3 = new Rectangle(100,70,40,30);
     rec3.setColor(Color.CYAN);
     rec3.fill();
     Rectangle rec4 = new Rectangle(40,40,40,30);
     rec4.setColor(Color.RED);
     rec4.fill();
     Rectangle rec5 = new Rectangle(80,40,40,30);
     rec5.setColor(Color.PINK);
     rec5.fill();
    Rectangle rec6 = new Rectangle(60,10,40,30);
     
    rec6.setColor(new Color(125,125,255));
     rec6.fill();
    }
    
}