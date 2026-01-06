package innerClass;

public class Outer 
{
	class Inner
	{
		void innerDisplay()
		{
			System.out.println("i am innerDisplay");
		}
	}
	void OuterDisplay()
	{
		System.out.println("i am outerDisplaly");
	}

	public static void main(String[] args) 
	{
		Outer objOuter= new Outer();
		Inner objInner= objOuter.new Inner();
		objInner .innerDisplay();
		objOuter.OuterDisplay();
		

	}

}
