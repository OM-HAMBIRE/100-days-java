
import java.util.*;
public class OmHambireDay9 {

public static void main(String [] args)
{
	Scanner sn=new Scanner(System.in);
	int num=sn.nextInt();
	
	int count=0;
	
	while(num!=0)
	{
		num/=10;
		++count;
	}
	System.out.println(count);
}
}
