package sample.java;

public class Arraysingle {
	public static void main(String args[])
	{
		try
		{
			int numbers[] = {100, 200, 300};
			System.out.println(numbers[5]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid array index");
		}
	}

}
