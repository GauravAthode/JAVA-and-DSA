package conditional_assignment_part2;

public class Main15 
{
	public static boolean isValidTriangle(int x,int y,int z)
	{
		int add=x+y+z;
		return x>0&&y>0&&z>0? add==180?  true : false: false;
	}
	public static void main(String[] args) 
	{
		int x=90;
		int y=45;
		int z=45;
		System.out.println(isValidTriangle(x,y,z));
	}
}
