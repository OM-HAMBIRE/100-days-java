package java100days;
//Take an input character from user and check whether it is an alphabet or not.
//Input : A
//
//Output:  Alphabet
//
//Input: 7
//
//Output: Not an alphabet
import java.util.*;
public class day2{
public static void main(String[] args) 
{
Scanner sn= new Scanner(System.in);
char ch=sn.next().charAt(0);
if (ch<='a' && ch>='z') 
{
System.out.println("Alphabet");
}
else if(ch<='A' && ch>='Z')
{
System.out.println("Alphabet");
}
else 
{
System.out.println("Not an alphabet");
}
}
}