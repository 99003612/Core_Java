
public class instancemethod {
	public int numbe;
	public String nam;
	public static void show()
	{
		System.out.println("I am static method"); //this is static method
	}
		
	public void displa()//this is instance method
	{
		vision();
		System.out.println("Reg No "+numbe);
		System.out.println("Name "+ nam);
	}
	public void vision()//instance method
	{
		System.out.println("Focus to Learn");
	}
}
