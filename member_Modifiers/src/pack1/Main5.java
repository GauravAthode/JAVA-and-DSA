//Different Package Non-sub Class................................
package pack1;
import pack2.Main;

public class Main5 
{
	public static void main(String[] args) 
	{
		Main obj = new Main();
		System.out.println(obj.b);
		System.out.println();
		System.out.println(Main.b1);
		System.out.println();
		obj.b();
		System.out.println();
		Main.b1();
	}
}
