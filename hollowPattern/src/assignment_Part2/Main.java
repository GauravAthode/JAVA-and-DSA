package assignment_Part2;

public class Main 
{
	public static void question1() 
	{
		System.out.println("Question No.1");
		int n=6;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<11; c++)
			{
				if(r==n-1 || r+c==n-1 || c-r==n-1)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
	
	public static void question2() 
	{
		System.out.println("Question No.2");
		int n=6;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<11; c++)
			{
				if(r==0 || r==c || r+c==11-1)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}	
	}
	
	public static void question3() 
	{
		System.out.println("Question No.3");
		int n=11;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<6; c++)
			{
				if(c==0 || r==c || r+c==n-1 )
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}	
	}
	
	public static void question4() 
	{
		System.out.println("Question No.4");
		int n=6;
		for(int r=0; r<11; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==n-1 || r+c==n-1 || r-c==n-1 )
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}	
	}
	
	public static void question5() 
	{
		System.out.println("Question No.5");
		int n=6;
		for(int r=0; r<11; r++)
		{
			for(int c=0; c<11; c++)
			{
				if(c+r==n-1 || c-r==n-1 || r-c==n-1 || r+c==15)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
	
	public static void question6() 
	{
		System.out.println("Question No.6");
		int n=11;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==0 || c==n-1 || c==r || r+c==n-1)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
	
	public static void question7() 
	{
		System.out.println("Question No.7");
		int n=6;
		for(int r=0; r<11; r++)
		{
			for(int c=0; c<11; c++)
			{
				if(c+r==n-1 || c-r==n-1 || r-c==n-1 || r+c==15 || c==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
	
	public static void question8() 
	{
		System.out.println("Question No.8");
		int n=6;
		for(int r=0; r<11; r++)
		{
			for(int c=0; c<11; c++)
			{
				if(c+r==n-1 || c-r==n-1 || r-c==n-1 || r+c==15 || r==n-1)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}	
	}
	
	public static void question9() 
	{
		System.out.println("Question No.9");
		int n=6;
		for(int r=0; r<11; r++)
		{
			for(int c=0; c<11; c++)
			{
				if(c+r==n-1 || c-r==n-1 || r-c==n-1 || r+c==15 || c==0 || c==11-1)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
	
	public static void question10() 
	{
		System.out.println("Question No.10");
		int n=6;
		for(int r=0; r<11; r++)
		{
			for(int c=0; c<11; c++)
			{
				if(c+r==n-1 || c-r==n-1 || r-c==n-1 || r+c==15 || r==0 || r==11-1)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}	
	}

	public static void main(String[] args) 
	{
		question1();
		System.out.println();
		question2();
		System.out.println();
		question3();
		System.out.println();
		question4();
		System.out.println();
		question5();
		System.out.println();
		question6();
		System.out.println();
		question7();
		System.out.println();
		question8();
		System.out.println();
		question9();
		System.out.println();
		question10();
	}
}
