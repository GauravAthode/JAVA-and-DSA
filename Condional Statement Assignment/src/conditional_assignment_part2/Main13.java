package conditional_assignment_part2;

public class Main13 
{
	public static int calculateTotalAmount(int x,int y,int z)
	{
		int notesof100=x*100;
		int notesof500=y*500;
		int notesof2000=z*2000;
		int result = notesof100+ notesof500+notesof2000;
		return result;		
	}
	public static void main(String[] args) 
	{
		int x=8;
		int y=9;
		int z=6;
		int ans=calculateTotalAmount(x,y,z);
		if(ans>=10000)
		{
			System.out.println("Amount exceeds 10,000");
		}
		else 
		{
			System.out.println("Amount is within limit");
		}	
	}
}
