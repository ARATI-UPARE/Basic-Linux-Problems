import java.util.Scanner;

public class FlipCoin 
{
	public static void main(String []arg)
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enetr no.of times to flip a coin");
		 int n=s.nextInt();
		 double tail=0.0,head=0.0;
		 for(int i=0;i<n;i++)
		 {
			double d= Math.random();
			
			if(d<=0.5)
			{
				tail++;
			}
			else
			{
				head++;
			}
		 }
		 int Hper=(int) (head/10*100);
		 int Tper=(int) (tail/10*100);
		 System.out.println("Percentage of getting head "+Hper);
		 System.out.println("Percentage of getting tail "+Tper);
		 s.close();	 
	 }
}
