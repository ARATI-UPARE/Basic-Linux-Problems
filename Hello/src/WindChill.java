import java.util.*;

public class WindChill
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Temperature");
		double t=s.nextDouble();
		System.out.println("Enter wind speed");
		double v=s.nextDouble();
		double w=0.0;
		
		if(t>50||(v>120||v<3))
		{
			System.out.println("This Formula is not valid for your input");
		}
		else
		{
			w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
			System.out.println("WindChill Number: "+w);
		}
		s.close();
	}

}
