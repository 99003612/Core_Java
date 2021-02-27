
public class ExceptionDemo 
{
	public static void main(String[] args) throws ArithmeticException
	{
		System.out.println("Welcome to Exception");
		try
		{
			int a = 10/0;
		}
		catch(Exception e)
		{
			System.out.println("The exception is : "+e);
		}
		finally
		{
			System.out.println("Welcome Again..");
		}
		
		System.out.println("Thank You...");
		
		
		
	}

}
