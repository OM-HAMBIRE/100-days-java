package java100days;
import java.util.*;
// Day 24/100
// print Pyramid pattern using stars
public class Star_24 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number of rows:");
		int num=sc.nextInt();
		Star(num);
	}
	public static void Star(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
