import java.util.*;

public class Distance
{
 public static void main(String arg[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the value of x&y ");
	 int x=s.nextInt();
	 int y=s.nextInt();
	 double dist=0;
	 dist=Math.sqrt(x*x-y*y);
	 System.out.println(dist);
 }
}
