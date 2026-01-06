package conditional_assignment_part2;

public class Main17 
{
	public static String checkTriangleType(int x, int y, int z)
	{
		if(x!=y&&x!=z)
		{
			return "Scalene";
		}
		else if(x==y && y==z)
		{
			return "Equilateral";	
		}
		else 
		{
			return "Isosceles";	
		}
	}
	public static void main(String[] args) 
	{
		int x=6;
		int y=8;
		int z=6;
		System.out.println(checkTriangleType(x,y,z));
	}
}
