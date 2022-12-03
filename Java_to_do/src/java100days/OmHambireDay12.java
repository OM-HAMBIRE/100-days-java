package java100days;
import java.util.*;
public class OmHambireDay12 {
public static void main(String[] args) {
	
/*sum of digits*/
	Scanner sn=new Scanner(System.in);
	int num =sn.nextInt();
	int digit,sum=0;
	while(num>0)
	{	
		digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	System.out.println(sum);
}
}