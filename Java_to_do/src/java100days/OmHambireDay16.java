package java100days;
import java.util.*;
public class OmHambireDay16 {
	/*Program for Perfect Number*/
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sn.nextInt();
		
		int sum=0;
		for (int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else
		{
			System.out.println(num+" is not a Perfect Number");
		}
	}

}
