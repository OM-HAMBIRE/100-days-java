package talent_Battle;
import java.util.*;
public class OmHambireDay15 {
//	Strong no= 145
//
//	Here 1! + 4! + 5! is 1 + 24 + 120 
//	which is equal to 145 itself.
	
	public static int fact(int num)
	{
		int fact=1;
		for(int i=0;i<num;i++)
		{
			fact=fact*(i+1);
		}
		return fact;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("program for Strong number");
	System.out.println("enter number:");
	int num=sc.nextInt();
	int num1=num;
	int digit,sum=0;
	
	
	while(num>0)
	{
		digit=num%10;
		sum=sum+fact(digit);
		num=num/10;
		
	}
	if(num==0)
	{
		sum+=fact(num);
	}
	
	if(sum==num1)
	{
		System.out.println(num1 +" is Strong number");
	}
	else
	{
		System.out.println(num1 +" is Not a Strong number");
	}
	
}
}
