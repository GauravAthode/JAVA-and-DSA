package inharitance;

import inharitance1.C;

public class Main 
{
	public void sport()
	{
		System.out.println("I am sport of class Main");
	}

	public static void main(String[] args) 
	{
		Main objMain = new Main();
		A objA = new A();
		B objB = new B();
		C objC = new C();
		objMain.sport();
		objA.sport();
		objB.sport();
	}
}

class A
{
	public void sport()
	{
		System.out.println("I am sport of class A");
	}
}
