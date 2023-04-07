//day42/100
// check if two arrays are the same or not
import java.util.*;
public class Array_Same_42 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array :");
		int n1=sc.nextInt();
		System.out.println("Enter the size of second array :");
		int n2=sc.nextInt();
		System.out.println("Enter elements of first array :");
		int a1[]=new int [n1];
		for (int i = 0; i < n1; i++) 
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of second  array :");
		int a2[]=new int [n2];
		for (int i = 0; i < n2; i++) 
		{
			a2[i]=sc.nextInt();
		}
		if(same(a1, n1, a2, n2))
		{
			System.out.println("Same");
			
		}
		else
		{
			System.out.println("Not Same");
		}
	}
	
	public static boolean same(int a1[],int n1,int a2[],int n2)
	{
		boolean isSame=true;
		if(n1!=n2)
		{
			isSame=false;
			return isSame;
		}
		Arrays.sort(a1);
        Arrays.sort(a2);
		for (int i = 0; i < n1; i++) 
		{
			 {
				
			
				if(a1[i]==a2[i])
					isSame=true;
				else
					isSame=false;
			}
			
		}
		return isSame;
	}
}