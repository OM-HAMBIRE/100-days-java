import java.util.*;
// Day 26/100
// Calculate Maximum number of handshakes
public class Handshake_26
{	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of person in the room");
		int num=sc.nextInt();
		count(num);
	}
	public static void count(int n)
	{
		n=(n*(n-1)/2);
		System.out.println("Number of handshake : "+n);
	}
	
}