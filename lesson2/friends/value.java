import java.util.Scanner;
/**
 * Write a description of class value here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class value
{
    public static int items = 6;
    
    public static void main(String args[])
    {
      int count = 17;
int x = 1;
int i=0;
while(count > x){
x*=3;
count-=3;
i++;
}
System.out.println(x + " " + count + " " + i);
	
	Scanner in = new Scanner(System.in);		
	String input = in.next();
	double[][] a=new double[4][5];
	int num[]={9,8,7,6,5,4,3,2,1}; 
for(int i=0;i<9;i=i+3) 
System.out.print(num[i]);
}
}