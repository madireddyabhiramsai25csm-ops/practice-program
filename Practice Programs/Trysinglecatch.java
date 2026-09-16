package sample.java;

public class Trysinglecatch {
	public static void main(String args[])
	{
		try
		{
			int a = 100;
			int b = 0;
			int result = a/b;
			System.out.println("result:" + result);
		}
		catch (ArithmeticException e) {
			
			System.out.println("cannot divide by zero");
			
		}
	}
}


