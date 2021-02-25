import java.lang.*;
class DemoString1
{
	public static void main(String[] args)
	{
		String s1="Hello"; //String literal
		String s2="Hello"; //String literal

		String s3= new String("Hello"); //String object and its value
		String s4= new String("Hello"); //String object and its value

		System.out.println("Length  of Hello: "+s1.length());

		System.out.println("Equal Operator for literals "+(s1==s2));
		System.out.println("Equal Operator for object and its values "+ (s3==s4));
	}
}