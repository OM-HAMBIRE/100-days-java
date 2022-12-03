package java100days;
import java.util.*;
/*Sum of N natural numbers*/
public class OmHambireDay13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	num=(num*(num+1))/2;
	sc.close();
	System.out.println(num);
}
}
