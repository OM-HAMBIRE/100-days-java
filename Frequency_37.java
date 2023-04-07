//Day 37/100
//Calculate the Frequency of characters in a string

import java.util.*;
	public class Frequency_37 
	{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string:");
			String str=sc.nextLine();
			method(str);
		}
		public static void method(String str)
		{
			int feq[]=new int [str.length()];
			char ch[]=str.toCharArray();
			//int count=0;
			for(int i=0;i<str.length();i++)
			{	
				feq[i]=1;
				 //count=0;
				for(int j=i+1;j<str.length();j++)
				{
					if(ch[i]==ch[j])
					{
						feq[i]++;
						ch[j]='0';
						
					}
				}
			}
			System.out.println("Frequencies:");
			for(int i=0;i<feq.length;i++)
			{
				if((ch[i]!=' ') && (ch[i]!='0') )
				{
					System.out.println(ch[i]+"-"+feq[i]);
				}
			}
			
		}
}