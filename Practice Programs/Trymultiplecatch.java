package sample.java;

public class Trymultiplecatch {
	public static void main(String args[])
	{
		try
		{
			int a = 10;
			int b = 0;
			int result = a/b;
			System.out.println("result:" + result);
			
			int numbers[] = {10, 20};
			System.out.println(numbers[5]);
		}
			
			catch (ArithmeticException e)
			{
				System.out.println("cannot divide by zero");
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid array index");
			}
	}
}
