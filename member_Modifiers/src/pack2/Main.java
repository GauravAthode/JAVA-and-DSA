package pack2;

public class Main 
{
	int a=32;
	public int b=73;
	private int c=66;
	protected int d=81;
	
	static int a1=32;
	public static int b1=73;
	private static int c1=66;
	protected static int d1=81;
	
    void a()
	{
    	System.out.println("Default");
	}
	public void b()
	{
		System.out.println("Public");
	}
	private void c()
	{
		System.out.println("Private");
	}
	protected void d()
	{
		System.out.println("protected");
	}
	
	static void a1()
	{
		System.out.println("Default Static");
	}
	public static void b1()
	{
		System.out.println("Public Static");
	}
	private static void c1()
	{
		System.out.println("Private Static");
	}
	protected static void d1()
	{
		System.out.println("Protected Static");
	}
}
