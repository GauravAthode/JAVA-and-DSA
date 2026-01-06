package conditional_assignment_part2;

public class Main17 
{
	public static String checkTriangleType(int a,int b,int c)
	{
		return a!=b&&a!=c? "Scalene" : 
			   a==b&&b==c? "Eulilateral" : "Isosceles";
	}
	public static void main(String[] args) 
	{
		int a=5;
		int b=3;
		int c=2;
		System.out.println(checkTriangleType(a,b,c));
	}
}
