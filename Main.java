import java.util.*;
import java.lang.*;
import java.io.*;
abstract class Shape
	{
	abstract void draw();
	abstract void erase();	
	}
class Circle extends Shape
	{
	 void draw()
		{
		System.out.println("Drawing Circle.....");
		}
	void erase()
		{
		System.out.println("Erasing Circle.....");
		}
	}
class Triangle extends Shape
	{
	 void draw()
		{
		System.out.println("Drawing Triangle.....");
		}
	void erase()
		{
		System.out.println("Erasing Triangle.....");
		}
	}
class Square extends Shape
	{
	 void draw()
		{
		System.out.println("Drawing Square.....");
		}
	void erase()
		{
		System.out.println("Erasing Square.....");
		}
	}
class Main
	{
	public static void main(String args[])
	{
	Circle c=new Circle();
	Triangle t=new Triangle();
	Square s=new Square();
	c.draw();
	c.erase();
	t.draw();
	t.erase();
	s.draw();
	s.erase();
	System.out.println("Program End here");
	}
	}