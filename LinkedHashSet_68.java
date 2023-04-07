// Day 68/100
/*1:Add an element to the set.
  2: Delete an element from the set. (If the number is not present in the set, then do
  nothing).
  3: If the number is present in the set, then print "Yes"(without quotes) else print
 "No"(without quotes).*/
import java.util.*;

public class LinkedHashSet_68 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Set<Integer> s = new LinkedHashSet<Integer>();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a=sc.nextInt();
			if(n==1)
			{
				s.add(a);
			}
			else if(n==2)
			{
				if(s.contains(a))
					s.remove(s);
			}
			else if(n==3)
			{
				if(s.contains(a))
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}
}
