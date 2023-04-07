//Day 69/100
//MultiLevel_Inheritance


class Isosceles 
{
	void d1()
	{
		System.out.println("I am an isosceles triangle");
	}
}
class Equilateral extends Isosceles
{
	void d2()
	{
		
		System.out.println("I am an equilateral triangle");
	}
}

class Triangle extends Equilateral
{

	void d3()
	{
		
		System.out.print("I am Triangle");
	}
}

public class MultiLevel_Inheritance_69 
{
	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();
		
		t1.d2();
		t1.d1();
		t1.d3();
		
	}
}