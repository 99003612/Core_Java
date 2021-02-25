import java.util.*;
class Nonarray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of values you need");
		int n = sc.nextInt();
		int a =0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter value of "+ i + ":");
			a=sc.nextInt();
		}
	System.out.println("My Values are : " + a);
	}
}