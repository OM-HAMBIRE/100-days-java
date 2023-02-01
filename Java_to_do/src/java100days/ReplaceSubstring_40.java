package java100days;
//day 40/100
//Replace substring in a string
import java.util.*;
public class ReplaceSubstring_40 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		System.out.println("enter the substring to be removed:");
		String s2=sc.nextLine();
		System.out.println("Enter the new substring :");
		String s3=sc.nextLine();
		
		String s4= s1.replaceAll(s2, s3);
		System.out.println(s4);

	}

}
