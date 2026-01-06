package conditional_assignment_part2;

public class Main16 
{
	public static boolean isValidTriangleSides(int a, int b,int c)
	{
		if(a+b>c&&b+c>a&&c+a>b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		int a=3;
		int b=4;
		int c=5;
		System.out.println(isValidTriangleSides(a,b,c));
	}
}
