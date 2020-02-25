import java.util.Scanner;

public class PowerOf2 
{
	public static void main(String arg[])
	 {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter Power of 2");
		 
		 int N=s.nextInt();
		 
		 int power=1;
		 
		 if((N<0)||(N>31))
		 {
			 System.out.println("Please enter power on range of 1 to 31");
			 return;
		 }
		 else
		 {
			 while(N>0)
			 {
				 power=power*2;
				 N--;
			 }
			 System.out.println("Power of 2 is "+power);
		 }
		 s.close();
	 }
}
