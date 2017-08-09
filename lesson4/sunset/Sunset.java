import java.util.Scanner;
public class Sunset
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        System.out.println(" The reddening value ");
        Scanner in = new Scanner (System.in);
        int getRedden = in.nextInt();
        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(getRedden);
            pic.setColorAt(i, c);
        }
    }
}
