
public class StringDemoMain 
{
	public static void main(String[] args)
	{
		String s = new String("Hello");
		StringBuffer sb =  new StringBuffer("Hello");
		
		System.out.println(s.concat("Good Morning"));
		System.out.println(sb.append("Good Morning"));
		
		System.out.println("Comparison of Variables");
		
		System.out.println(s);
		System.out.println(sb);
	}

}
