package java100days;
import java.util.*;
//Write a program to find roots of a quadratic equation

public class OmHambireDay8 
{
public static void main(String[] args) {
	Scanner sn=new Scanner (System.in);
	double a=sn.nextDouble();
	double b=sn.nextDouble();
	double c=sn.nextDouble();
	
	double root1, root2;

    
    double determinant = b * b - 4 * a * c;

  
    if (determinant > 0) {

      
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }

  
    else if (determinant == 0) {

      
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }

  
    else {

     
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	}
}
}

