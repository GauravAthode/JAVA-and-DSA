package Pack1;

public class Main 
{
	public static int print(int x)
	{
		if(x==0)
		{
			return 0;
		}
		return print(x-1)+x;
	}
	public static void main(String[] args) 
	{
		System.out.println(print(5));
	}
}
