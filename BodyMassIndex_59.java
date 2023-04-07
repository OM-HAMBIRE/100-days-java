// day 59/100
// Body mass index
import java.util.*;
public class BodyMassIndex_59 
{
	public static void main(String[] args) 
	{
		
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			double m=sc.nextInt();
			double h=sc.nextInt();
			double bmi=m/(h*h);
			if(bmi<=18)
				System.out.println("1");
			else if(bmi>=19 && bmi <=24)
				System.out.println("2");
			else if(bmi>=25 && bmi<=29)
				System.out.println("3");
			else 
				System.out.println("4");
			
		}
	}
}