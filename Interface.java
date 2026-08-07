package sample.java;

interface A
{
	int a=10;
	void show();
}
interface B
{
	int a=20;
	void show();
}
class C implements A,B
{
	int c;
	public void show() {
		c = A.a + B.a;
System.out.println("A.a=" + A.a);
System.out.println("B.a" + B.a);
System.out.println("c" + c);
	}
}
public class Interface {
public static void main(String args[]) {
	C obj = new C();
	obj.show();
}
}
