package studentinfo;

public class Main 
{
	String name;
	String collage;
	int age;
	long mob;
	
	public void display()
	{
		System.out.println("1");
		System.out.println(name+" "+collage+" "+age+" "+mob);
	}
	
	public Main(String n, String cn, int a, long mn)
	{
		name=n;
		collage=cn;
		age=a;
		mob=mn;
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		Main sc = new Main("krishnkant","LNCT",23,8392893839l);
	    Main mith= new Main("shd", "sldnf", 23, 9678379328l);
	    mith.display();
	    
	    
	}
}