
public class DemoRunTimeException 
{
	public static void main(String[] args)
	{
		try
		{
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}
		
		
		try 
		{
			int [] arr = new int[2];
			arr[3]= 30;
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
		
		try
		{
			String s = "Ajay";
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException n)
		{
			System.out.println("Number Format Exception");
		}
	}

}
