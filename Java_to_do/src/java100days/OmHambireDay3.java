
package java100days;
//Get an input character from the user and the give the ASCII value of the given input as the output.
import java.util.*;
public class OmHambireDay3 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter charcter:");
		char ch=sn.next().charAt(0);
		int asci=(int)ch; //or int asci=ch;
		System.out.println("Ascii Value is "+asci);
	}
	
	

}
