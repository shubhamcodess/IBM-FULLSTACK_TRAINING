package com.abstractclass;

abstract class Shape{
	abstract void draw();
}
class Line extends Shape{
	void draw()
	{
	System.out.println("A Line is Drawn");
	}
}
class Rectangle extends Shape{
	void draw()
	{
		System.out.println("A Rectangle is Drawn");
	}
}
class Cube extends Shape{
	void draw()
	{
		System.out.println("A Cube is Drawn");
	}
}

public class ShapeTest
{
	public static void main(String args[])

	{
		Shape s[]=new Shape[3];
		s[0]=new Line();
		s[1]=new Rectangle();
		s[2]=new Cube();
		
		for(int i=0;i<s.length;i++)
		{
			s[i].draw();
		}
	}
}

