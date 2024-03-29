package ExceptionalHandling;

public class TestTrycatchFinally {

	public static void main (String[] args)
	{
	// array of size 4.
		
	int[] array = new int[4];
	try
	{
	int i = array[4];
	
	// this statement will never execute
	// as exception is raised by above statement
	
	System.out.println("Inside try block");
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
	System.out.println("Exception caught in catch block");
	}
	finally // always executed compulsory
	{
	System.out.println("finally block executed");
	}
	// rest program will be executed
	
	System.out.println("Outside try-catch-finally clause");
	}
	}