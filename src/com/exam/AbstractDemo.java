package com.exam;

abstract class Shape
{
	abstract void NoOfSides();
}

class Rectangle extends Shape
{
	public void NoOfSides()
	{
		System.out.println("Rectangle: 4");
	}
}

class Triangle extends Shape
{
	public void NoOfSides()
	{
		System.out.println("Triangle: 3");
	}
}

class Hexagon extends Shape
{
	public void NoOfSides()
	{
		System.out.println("Hexagon: 6");
	}
}
public class AbstractDemo 
{
	public static void main(String a[])
	{
		Rectangle r=new Rectangle();
		Triangle t= new Triangle();
		Hexagon h=new Hexagon();
		
		r.NoOfSides();
		t.NoOfSides();
		h.NoOfSides();
	}

}
