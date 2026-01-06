package localClass;

public class Main 
{
	class Inner
	{
		void innerClass()
		{
			class Inner2
			{
				void print()
				{
					System.out.println("krishnkant");
				}
			}
			Inner2 objInner2= new Inner2();
			objInner2.print();
		}
		
	}

	public static void main(String[] args) 
	{
		Main objMain = new Main();
		Inner objInner= objMain.new Inner();
		objInner.innerClass();

	}

}
