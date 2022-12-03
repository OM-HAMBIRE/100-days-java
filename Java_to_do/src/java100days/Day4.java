package java100days;
import java.util.*;
public class Day4 {
	public static void main(String[] args) {
		Scanner sn=new Scanner (System.in);
		System.out.println("enter number:");
		int num=sn.nextInt();
		if(num>0)
		{
			System.out.println("Positive number");
			
		}
		else if(num<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Neither positive nor negative");
		}

}
}
