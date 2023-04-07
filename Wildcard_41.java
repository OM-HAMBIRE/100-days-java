/*day 41/100
two strings match where one string contains 
wildcard characters*/

import java.util.*;
public class Wildcard_41 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string with wild card letters *,?: ");
		String pat=sc.nextLine();
		
		System.out.println("enter the string without wildcard letters:");
		String str=sc.nextLine();
		if(wildcard(str, pat, 0, 0))
			System.out.println("yes");
		else
				System.out.println("no");
		
	}
	
	public static boolean wildcard(String str,String pat,int i,int j)
	{
		if(i==str.length()&&j==pat.length())
		{
			return true;
		}
		
		if(i==str.length())
		{
			for(int k=j;k<pat.length();k++)
			{
				if(pat.charAt(k)!='*')
					return false;
			}
			return true;
		}
		
		if(j==pat.length()&&i!=str.length())
		{
			return false;
		}
		boolean ans=false;
		if(pat.charAt(j)=='?')
		{
			if(wildcard(str, pat, i+1, j+1))
				ans=true;
		}
		else if(pat.charAt(j)=='*')
		{
			if(wildcard(str, pat, i+1, j))
				ans =true;
			if(wildcard(str, pat, i+1, j+1))
				ans=true;
			if(wildcard(str, pat, i, j+1))
				ans=true;
		}
		else
		{
			if(str.charAt(i)==pat.charAt(j) && wildcard(str, pat, i+1, j+1))
				ans =true;
		}
		return ans;
	}
}