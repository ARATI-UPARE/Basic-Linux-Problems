import java.util.*;
public class Quadratic
{
 public static void main(String arg[])
 {
	 double a=-0.5,b=0.85,c=8.0;
	 double del=0.0;
	 
	 del= b*b - 4*a*c;
	 System.out.println(del);
	 double r1,r2;
	 
	 if(del>0)
	 {
	 r1= (-b + Math.sqrt(del))/(2*a);
     r2= (-b - Math.sqrt(del))/(2*a);
     System.out.println("Root1:"+r1);
     System.out.println("Root2:"+r2);
	 }
	 else if(del==0)
	 {
		 r1 = r2 = -b / (2 * a);
		System.out.printf("root1 = root2 = %.2f;", r1);
	 }
	 else
	 {
		 double realPart = -b / (2 *a);
		 double imaginaryPart = Math.sqrt(-del) / (2 * a);
		System.out.printf(" Root1:%.2f+ %.2fi",realPart,imaginaryPart);
		System.out.println();
		System.out.printf(" Root2:%.2f- %.2fi",realPart,imaginaryPart);
	 }

 }
}
