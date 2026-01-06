//Different package - subclass....................................
package pack1;
import pack2.Main;

public class Main4 extends Main
{
	public static void main(String[] args) 
	{
		Main4 obj = new Main4();
		System.out.println(obj.b+" "+obj.d);
		System.out.println();
		System.out.println(Main4.b1+" "+Main4.d1);
		System.out.println();
		obj.b();
		obj.d();
		System.out.println();
		Main4.b1();
		Main4.d1();
	}
}
