package innerClass;

public class Main 
{
	int a=34;
	class Joy
	{
		int  a=64;
	}
	static class Student
	{
		int a=73;
		
	}

	public static void main(String[] args) 
	{
		Main objMain= new Main();
		System.out.println(objMain.a);
		Joy obJoy= objMain.new Joy();
		System.out.println(obJoy.a);
		Student objStudent=new Student();
		System.out.println(objStudent.a);
	}

}
