package java100days;
import java.util.*;
//Write a program to find Number of days in a given month of a given
//year
public class OmHambireDay7 {
	public static void main(String[] args) 
	{
		
	
	Scanner sn=new Scanner(System.in);
	System.out.println("Enter valid Month and Year:");
	int month=sn.nextInt();
	int year=sn.nextInt();
	
	
	if(month<0 || month<=12 ) 
	{
		if(month==1|| month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("31");
		}
	
		else if(month==2 && (year%400)==0 || ( (year%4==0)&&(year%100)!=0 ) ) 
		{
			System.out.println("29");
		}
		else if(month==2) 
		{
			System.out.println("28");
		}
	
		else
		{
			System.out.println("0");
		}
	
	}
	
	else
	{
		System.out.println();
	}
	
	}

}
