package exception.java;

public class Numberformatexception {
	public static void main(String args[])
	{
		try
		{
			int number = Integer.parseInt("ABHI");
			System.out.println(number);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Invalid number index");
		}
	}

}
