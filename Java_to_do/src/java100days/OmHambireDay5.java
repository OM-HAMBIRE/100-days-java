package java100days;
//the number is odd or even
import java.util.*;
public class OmHambireDay5 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter number:");
		int num =sn.nextInt();
		
		System.out.println("ans using method 1:");
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		System.out.println("ans using method 2:");
		int digit=num & 1;
		if(digit==0)
		{
			System.out.println("even no");
		}
		else
		{
			System.out.println("odd number");
		}
	}

}
