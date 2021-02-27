
public interface FourWheel 
{
	public void show();
	default void seen()
	{
		System.out.println("Hello from Interface");
	}

}
