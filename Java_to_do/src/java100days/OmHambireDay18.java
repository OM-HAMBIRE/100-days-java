package java100days;
import java.util.*;

/*Program to add 2 fractions*/

public class OmHambireDay18 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fraction 1:");
		System.out.println("x1:");
		float x1=sc.nextFloat();
		System.out.println("y1:");
		float y1=sc.nextFloat();
		System.out.println("enter fraction 2:");
		System.out.println("x2:");
		float x2=sc.nextFloat();
		System.out.println("y2:");
		float y2=sc.nextFloat();
	
		float x3;
		float y3;
		float Div;
	
		x3=(x1*y2) +(y1*x2);
		y3=(y1*y2);
		
		if (x3>y3)
			Div=y3;
		else
			Div=x3;
		
		for(float i=Div;i>0;i--)
		{	
			if(x3%i==0&& y3%i==0) 
			{
				x3=x3/i;
				y3=y3/i;
			}
		}
		System.out.println("Addition of two numbers:"+x3+"/"+y3);
	}
}
