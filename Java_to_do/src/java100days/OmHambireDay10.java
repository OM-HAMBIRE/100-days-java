package java100days;
//Get a number from user for which you need to find the factorial, then calculate the factorial and give it as 
//the output.
import java.util.*;
public class OmHambireDay10 
{
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		long num=sn.nextInt();
		if (num<0)
		{
			System.out.println("please enter positive number");
		}
		else 
		{
		long fact=1;
		for(long i=0;i<num;i++)
		{
			fact=fact*(i+1);
		}
		System.out.println(fact);
		}
		
	}

}
