import java.util.*;

public class VotingDemo 
{

	public static void main(String[] args) throws AgeLimitExceedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age<=17)
		{
			throw new AgeLimitExceedException();
			
		}
		else
		{
			System.out.println("You are eligible to vote");
		}

	}

}
