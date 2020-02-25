import java.util.*;

public class TripletCount 
{
 public static void main(String arg[])
 {
	 int arr[]=new int[5];
	 Scanner s=new Scanner(System.in);
	 System.out.print("Enter the elements of array ");
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i]=s.nextInt();
	 }
	 
	 int cnt=0,i,j,k;
	 for(i=0;i<arr.length-2;i++)
	 {
		 for(j=i+1;j<arr.length-1;j++)
		 {
			 for(k=j+1;k<arr.length;k++)
			 {
				 if(arr[i]+arr[j]+arr[k]==0)
				 {
					 System.out.println(arr[i]);
					 System.out.println(arr[j]);
					 System.out.println(arr[k]);
					 cnt++;
				 }
			 }
		  }
	 }
	 System.out.println("Triplet count is: "+cnt);
	 s.close();	 
   }
}
