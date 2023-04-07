import java.util.Scanner;

//Day 71/100
public class Average_Flex_71 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			
			int count=0;
			for (int i = 0; i < a.length; i++) {
				a[i]=sc.nextInt();
			}
			for (int i = 0; i < n; i++) 
			{ int small=0;
			int big=0;
				for(int j = 0; j < n; j++) 
				{
					
					if(a[i]>=a[j])
					{
						small++;
					}
					else 
						big++;
					
					
				}
				if(small>big)
				{
					count++;
				}
				
			}
			
			System.out.println(count);
			
		}
	}
}