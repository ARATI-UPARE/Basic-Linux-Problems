import java.util.Scanner;

public class FactorsOfNo
{
	public static void main(String[] arg)
	 {
		 
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter Number");
		 
		 int N=s.nextInt();
		 
		for(int j=1;j<=N/2;j++)
		{
			if(N%j==0)
			{
				System.out.print(j+" ");
			}
		}
		System.out.print(N);
	 }
}
