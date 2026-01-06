//Same package-sub class............................
package pack1;

public class Main2 extends Main1
{
	public static void main(String[] args) 
	{
		Main2 obj = new Main2();
		System.out.println(obj.a+" "+obj.b+" "+obj.d);
		System.out.println();
		System.out.println(Main1.a1+" "+Main1.b1+" "+Main1.d1);
		System.out.println();
		obj.a();
		obj.b();
		obj.d();
		System.out.println();
		Main1.a1();
		Main1.b1();
		Main1.d1();
	}
}
