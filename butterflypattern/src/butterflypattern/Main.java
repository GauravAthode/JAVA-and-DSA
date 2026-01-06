package butterflypattern;
public class Main 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();		
		}
		for(int i=0; i<3; i++)
		{
			for(int j=i; j<3; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();	
		}
	}
}
