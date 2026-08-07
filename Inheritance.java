package sample.java;
class Base

{
	int a;
}
class Derived extends Base
{
	int b;
	Derived()
	{
		a=10;
		b=20;
	}
void main()
{
System.out.println("sum is:"+(a+b));
}
}
public class Inheritance {
public static void main(String args[]) {
	Derived obj = new Derived();
	obj.main();
}
}
