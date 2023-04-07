
import java.util.*;
public class OmHambireDay6 {
	  public static void main(String[] args) {
		Scanner sn=new Scanner (System.in);
		int x=sn.nextInt();
		int y=sn.nextInt();
		
		if(x>0 && y>0) 
		{
			System.out.println("This point lies in first quadrant");
		}
		else if(x<0 && y>0)
		{
			System.out.println("This point lies in Second quadrant");
		}
		else if(x<0 && y<0)
		{
			System.out.println("This point lies in Third quadrant");
		}
		else if (x>0 && y<0)
		{
			System.out.println("This point lies in Fourth quadrant.");
		}
		else 
		{
			System.out.println("This point lies in the orgin.");
		}
	}

}
