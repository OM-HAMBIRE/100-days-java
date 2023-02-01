package java100days;
import java.util.*;
//day 25/100
// find Area of a circle
public class Circle_25 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		double rad=sc.nextDouble();
		Areaofcircle(rad);
	}
	public static void Areaofcircle(double rad)
	{	
		 double Area;	
		 Area=3.14*rad*rad;
		 System.out.println("Area of Circle:"+Area);
	}
}
