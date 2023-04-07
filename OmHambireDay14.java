
import java.util.*;
public class OmHambireDay14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int in=sc.nextInt();
	int rem,rev=0;
	while(in>0)
	{
		rem=in%10;
		rev=rev*10+rem;
		in=in/10;
		
	}
	System.out.println("Reverse of the number is: "+rev);
}
}
