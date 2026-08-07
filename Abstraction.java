package sample.java;

abstract class Shape
{
	abstract void draw();
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}
public class Abstraction {
public static void main(String args[])
{
	Rectangle rect = new Rectangle();
	rect.draw();
	Circle circ = new Circle();
	circ.draw();
}
}
