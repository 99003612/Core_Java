import java.util.*;
class DemoSwitch
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value(1/2/3)");
		int a = scn.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Thank You");

		}
	}
}