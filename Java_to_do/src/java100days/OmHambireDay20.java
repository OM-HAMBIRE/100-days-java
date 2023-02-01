package java100days;
import java.util.*;
public class OmHambireDay20 
{	
	static void PrimeNo(int num)
	{	int flag=0;
		if(num==0||num==1)
			System.out.println(num+" is Not Prime number");
		else if(num==2)
			System.out.println(num+" is  Prime number");
		else 
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
					
				{	System.out.println(num+" is Not Prime number");
					flag=1;
					break;
				}
				
			}
			
			if(flag==0)
			{
				System.out.println(num+" is Prime number");
			}
		
		}	
		
		
	}
	
	
	
		
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		PrimeNo(num);
		
			
	
}
}
