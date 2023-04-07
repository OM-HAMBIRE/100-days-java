//day 60/100
import java.util.Scanner;

public class GoodWeather_60 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=7;
		int a[]=new int[n];
		while(t-->0)
		{
			int count=0;
			int count1=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]==1)
					count++;
				else
					count1++;
			}
			if(count>count1)
				System.out.println("YES");
			else 
				System.out.println("NO");
			}
	}
}