package conditional_assignment_part2;

public class Main15 
{
	public static boolean isValidTriangle(int x,int y,int z)
	{
		int add=x+y+z;
		if(x>0 && y>0 && z>0)
		{
			if(add==180)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else 
		{
			return false;	
		}	
	}
	public static void main(String[] args) 
	{
		int x=90;
		int y=90;
		int z=0;
		System.out.println(isValidTriangle(x,y,z));
	}
}
