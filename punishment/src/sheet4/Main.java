package sheet4;

public class Main 
{
	public static void q1() 
	{
		System.out.println("q1");
		int n=6;
		for(int r=0; r<n; r++)
		{
			for( int c=0; c<11;c++)
			{
				if(r==n-1||c+r==n-1||c-r==n-1)
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
	public static void q2() 
	{
		System.out.println("q2");
		int n=6;
		for(int r=0 ; r<n; r++)
		{
			for( int c=0 ; c<11; c++)
			{
				if(r==0||c==r||c+r==11-1)
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
	public static void q3() 
	{
		System.out.println("q3");
		int n=11;
		for(int r=0 ; r<n; r++)
		{
			for(int c=0; c<6; c++)
			{
				if(c==0||r+c==n-1||c==r)
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
	public static void q4() 
	{
		System.out.println("q4");
		int n=11;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<6; c++)
			{
				if(c==n/2||r+c==n/2||r-c==n/2)
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
	public static void q5() 
	{
		System.out.println("q5");
		int n=11;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r+c==n/2||r-c==n/2||c-r==n/2||r+c==n+n/2-1)
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
	public static void q6() 
	{
		System.out.println("q6");
		int n=11;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n;c++)
			{
				if(c==0||c==n-1||c+r==n-1|c==r)
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
	public static void q7() 
	{
		System.out.println("q7");
		int n=11;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==n/2||r+c==n/2||c-r==n/2||r-c==n/2||r+c==n+n/2-1)
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
	public static void q8() 
	{
		System.out.println("q8");
		int n=11;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==n/2||r+c==n/2||r-c==n/2||c-r==n/2||r+c==n+n/2-1)
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
	public static void q9() 
	{
		System.out.println("q9");
		int n=11;
		for(int r=0; r<n;r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r+c==n/2||r+c==n+n/2-1||r-c==n/2||c-r==n/2||c==0||c==n-1)
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
	public static void q10() 
	{
		System.out.println("q10");
		int n=11;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r+c==n/2||r+c==n+n/2-1||r-c==n/2||c-r==n/2||r==0||r==n-1)
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
		q1();
		System.out.println();
		q2();
		System.out.println();
		q3();
		System.out.println();
		q4();
		System.out.println();
		q5();
		System.out.println();
		q6();
		System.out.println();
		q7();
		System.out.println();
		q8();
		System.out.println();
		q9();
		System.out.println();
		q10();
		System.out.println();

	}

}
