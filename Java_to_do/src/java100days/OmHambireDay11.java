package java100days;
import java.util.*;
/*Fibonnaci Series*/
public class OmHambireDay11 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter Positive number:");
		int n=sn.nextInt();
		int num1=0;
		int num2=1;
		int sum=0;
		System.out.println("fibonacci series of first "+n+" numbers are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(sum);
			num1=num2;
			num2=sum;
			sum=num1+num2;
		}
	}
}
