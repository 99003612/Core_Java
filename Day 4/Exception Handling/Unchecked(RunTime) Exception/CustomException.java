
class InvalidAgeException extends Exception
{
	InvalidAgeException()
	{
		System.out.println("You are under age");
	}
}

public class CustomException
{
	public static void main(String[] args) throws InvalidAgeException 
	{
		int age = 17;
		if(age<=18)
		{
			throw new InvalidAgeException();
		}
		else
		{
			System.out.println("Eligible to vote.");
		}
	}
}


