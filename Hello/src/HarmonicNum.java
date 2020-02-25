import java.util.Scanner;

public class HarmonicNum
{
 public static void main(String[] arg)
 {
	 int i=1;
	 int j=1;
	 float sum=1;
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter Nth value");
	 
	 int N=s.nextInt();
	 
	for(j=2;j<=N;j++)
	{
		sum=sum+(float)i/j;
	}
	System.out.println(sum);
 }
}
