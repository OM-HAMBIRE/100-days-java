
import java.util.*;
//  day23/100
// Replace all 0’s with 1 in a given integer
public class Replace0_23 
{	//Approach1:convert it into string 
	public static void replace(String str)
	{	
		int len=str.length();
		String str1="";
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='0')
			{
				str1=str1+'1';
			}
			else
				str1=str1+str.charAt(i);
		}
		System.out.println("1st Approach:"+str1);
	}
//	Approach 2:by remainder
	public static int replace1(int num)
	{
		int digit=0;
		int num1=0;
		int i=1;
		if(num==0)
			return 1;
		while(num>0)
		{
			digit=num%10;
			if (digit==0)
			{
				num1=1*i+num1;
			}
			else
			{
				num1=digit*i+num1;
			}
			i*=10;
			num/=10;
		}
		return num1;
		
//		int num1=0;
//		int digit=0;
//		int digit1=1;
//		if(num==0)
//			num1=1;
//		while(num>0)
//		{
//			digit=num%10;
//			if(digit==0)
//			{
//				digit=1;
//				
//			}
//			num=num/10;
//			num1=num1*10+digit;
//		}
//		num=0;
//		while(num1>0)
//		{
//			digit1=num1%10;
//			
//			num=num*10+digit1;
//			num1=num1/10;
//		}
//		return(num);
			
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		sc.close();
		String str=Integer.toString(num);
		replace(str);
		System.out.println("2nd approach:"+replace1(num));
	}
}