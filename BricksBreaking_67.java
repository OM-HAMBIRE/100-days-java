import java.util.Scanner;
// day 67/100
public class BricksBreaking_67 
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			
			int s=sc.nextInt();
			int w1=sc.nextInt();
			int w2=sc.nextInt();
			int w3=sc.nextInt();
			if(s>=w1+w2+w3)
				System.out.println("1");
			else if(s>=w1+w2)
				System.out.println("2");
			else if(s>=w2+w3)
				System.out.println("2");
			else
				System.out.println("3");
		}
	}
}