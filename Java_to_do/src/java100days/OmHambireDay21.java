package java100days;
import java.util.*;
public class OmHambireDay21 
{	//number is Palindrome or not
	static void Palindrome(int num)
	{	int temp=num;
		int digit=0,rev=0;
		while(temp>0)
		{ //reverse number 
			digit=temp%10;
			rev=rev*10+digit;
			temp/=10;
		}
		if(rev==num)
		{
			System.out.println(num+" is palindrome no");
		}
		else
			System.out.println(num+" is not palindrome no");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Palindrome(num);
	}
}
