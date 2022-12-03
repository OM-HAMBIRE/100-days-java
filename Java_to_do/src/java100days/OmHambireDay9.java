package java100days;
import java.util.*;
public class OmHambireDay9 {
/**
 * @param args
 */
public static void main(String [] args)
{
	/*count no of digits*/
	Scanner sn=new Scanner(System.in);
	int num=sn.nextInt();
	
	int count=0;
	
	while(num>0)
	{
		num/=10;
		++count;
	}
	System.out.println(count);
}
}
