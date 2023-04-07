// day 57/100
// check pass or fail code chef
import java.util.*;
public class PassFail_57 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n,x,p;
		while( t-->0)
		{
			 n=sc.nextInt();//total no of questions
			 x=sc.nextInt();//correct answers
			 p=sc.nextInt();//passing marks;
			 int total=x*3-(n-x);
			 
			 if(total>=p)
				 System.out.println("PASS");
			 else
				 System.out.println("FAIL");
		}
		
	}
}
