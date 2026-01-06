package aggrigation;

public class Student 
{
	String name;
	Collage collage;
	public Student(String name,Collage collage)
	{
		this.name=name;
		this.collage=collage;
		
	}

	public static void main(String[] args) 
	{
		Collage collage1 = new Collage("lnct");
		Collage collage2 = new Collage("tit");
		Student student1 = new Student("ankush", collage2);
		Student student2 = new Student("krishnkant", collage1);
		System.out.println(student1.name +"  "+collage1.name);
	}
}
class Collage
{
	String name;
	public Collage(String name) 
	{
		this.name=name;
	}
}
