package java100days;
import java.util.*;
import java.lang.Math;

public class OmHambireDay19 

{	//Program to print is number armstrong or not
	static boolean ArmStrong(int num)
	{	
	int temp=num;
	int digit =0,sum=0,count =0;
		while(temp !=0)
		{	//count of digits
			temp/=10;
			count++;
		}
		
		temp=num;
		
		while(temp>0)
		{
			digit=temp%10;
			sum+=  (Math.pow(digit, count));
			temp=temp/10;
		}
		if(num==sum)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner (System.in);
			
			int num=sc.nextInt();
			
			
			
			
			if(ArmStrong(num))
			{
				System.out.println(num+" is Armstrong no");
				
			}
			else
				System.out.println(num+" is not armstrong no");
		//Program to print armstrong between range	
//			for (int i=0;i<=num;i++)
//			{	if(ArmStrong(i))
//				System.out.println(i+" ");
//			}
	}
	
}
