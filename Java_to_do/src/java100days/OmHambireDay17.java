package java100days;
import java.util.*;
//Write a program to find the Factors of a number

/*Input-4

Output-1,2,4 */ 
public class OmHambireDay17 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		System.out.println("Factors of "+num+" are:");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
