import java.util.Scanner;

//day 63/100
public class WeightBalance_63 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int w1=sc.nextInt();
			int w2=sc.nextInt();
			int x1=sc.nextInt();
			int x2=sc.nextInt();
			int m=sc.nextInt();
			int w3=w2-w1;
			
			if((x1*m)<=w3 && w3<=(x2*m))
			{
				System.out.println("1");
			}
			else
				System.out.println("0");
			
		}
			
	}
}