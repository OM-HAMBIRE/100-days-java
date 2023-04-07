// day 65/100

import java.util.Iterator;
import java.util.Scanner;

public class NewTablet_65 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int b=sc.nextInt();
			int w=0;
			int h=0;
			int p=0;
			int area=0;
			
			for (int i = 0; i < n; i++) 
			{
				 w=sc.nextInt();
				 h=sc.nextInt();
				 p=sc.nextInt();
				 
				 if(p<=b)
					 area=Math.max(area, w*h);
			}
			
			if(area==0)
			{
				System.out.println("no tablet");
			}
			else 
			{
				System.out.println(area);
			}
			
		}
	}
}