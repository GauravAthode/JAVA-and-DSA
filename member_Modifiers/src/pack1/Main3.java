//Same Package Non-subclass............................
package pack1;

public class Main3 
{
	public static void main(String[] args) 
	{
		A obj = new A();
		System.out.println(obj.a+" "+obj.b+" "+obj.d);
		System.out.println();
		System.out.println(A.a1+" "+A.b1+" "+A.d1);
		System.out.println();
		obj.a();
		obj.b();
		obj.d();
		System.out.println();
		A.a1();
		A.b1();
		A.d1();
	}
}
class A
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
