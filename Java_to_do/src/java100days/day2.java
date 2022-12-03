package java100days;

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