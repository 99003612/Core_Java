class Instanceandstaticvariable
{
	int b = 100; //Instance Variable
	static int c = 1000; // Static Variable
	public static void main(String[] args)
	{
		int a = 10; // local variable.
		System.out.println("Inside Class Variable " + a);
		System.out.println("My Instance Variable "+ new VariableDemo().b);// to call the instance variable
		System.out.println("My Static Variable "+ c);
		c=10000;
		System.out.println("My new Static Variable "+ c);
		
	}
}