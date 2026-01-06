package thisKeyword;

public class Student 
{
	int age;
	String name;
	long mobno;
	
	public Student() 
	{
		this(21,"krishnkant");
	}
	public Student(int age,String name) 
	{
		this(age,name,9755784190l);
	}
	
	public Student( int age , String name, long mobno) 
	{
		this.age=age;
		this.name=name;
		this.mobno=mobno;
	}
	public void print()
	{
		System.out.println(age+" "+name+" "+mobno);
	}

	public static void main(String[] args) 
	{
		Student objStudent= new Student();
		objStudent.print();
	}
}
