import java.util.*;

public class TwoDArray
{
  public static void main(String []arg)
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter row value");
	  int r=s.nextInt();
	  System.out.println("Enter column value");
	  int c=s.nextInt();
	  int arr[][]=new int[r][c];
	  System.out.print("Enter the elements of array ");
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  arr[i][j]=s.nextInt();
		  }
	  }
	  
	  System.out.print("elements of array are: ");
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  System.out.print(" "+arr[i][j]);
		  }
		  System.out.println();
	  }
	  s.close();
  }
}
