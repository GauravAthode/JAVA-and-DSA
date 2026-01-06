//Same Class..........................
package pack1;

public class Main1 
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
	public static void main(String[] args) 
	{
		Main1 obj = new Main1();
		System.out.println(obj.a+" "+obj.b+" "+obj.c+" "+obj.d);
		System.out.println();
		System.out.println(Main1.a1+" "+Main1.b1+" "+Main1.c1+" "+Main1.d1);
		System.out.println();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		System.out.println();
		Main1.a1();
		Main1.b1();
		Main1.c1();
		Main1.d1();
	}
}

