import java.lang.*;
class DemoString2
{
	public static void main(String[] args)
	{
		String s1="Hello"; //String literal
		String s2="Hello"; //String literal

		String s3= new String("Hello"); //String object and its value
		String s4= new String("Hello"); //String object and its value
		String s5 = "Good Morning";

		System.out.println("Length  of Hello: "+s1.length());

		System.out.println("Equal Operator for literals "+(s1==s2));
		System.out.println("Equal Operator for object and its values "+ (s3==s4));

		//String Other Methods
		
		System.out.println("Check the count - Literals "+s1.equals(s2));
		System.out.println("Check the content with Object "+s3.equals(s4));
		System.out.println("Cross check" + s3.equals(s2));

		//Concat
		System.out.println("Concat " +s1.concat(s5));
	}
}