package october28;

public class Main 
{
	

	public static void main(String[] args) 
	{
		baby b= new baby();
		b.cry();
		b.student();
		b.farmer();

	}

}
class Father
{
	public void farmer()
	{
		System.out.println("father is a farmer");
	}
	
}
class son extends Father
{
	public void student()
	{
		System.out.println("son is a student");
	}
	
}
class baby extends son
{
	public void cry()
	{
		System.out.println("baby is crying");
	}
	}

