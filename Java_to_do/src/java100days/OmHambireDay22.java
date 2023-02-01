package java100days;
import java.util.*;
public class OmHambireDay22 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number:");
		int number=sc.nextInt();
		int x=0;
		
		for(int i=2;i<=number/2;i++)
		{
			if(PrimeNo(i)==1)
			{
				if(PrimeNo(number-i)==1)
				{
					System.out.println(number+" = "+ i +" + "+ (number-i));
					x=1;
				}
			}
		}
		
		if(x==0)
		{
			System.out.println(number+" cannot be expressed as a sum of two Prime Numbers");
		}
	}
	public static int PrimeNo(int n)
	{	int c=1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c=0;
				break;
			}
		}
		return c;
	}
}

