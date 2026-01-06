package sheet3;


public class Main 
{
	public static void q1()
	{
		System.out.println("q1");
		int n=5; 
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0||r==n-1)
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
		int n=5;
		for(int r=0; r<n; r++)
		{
			
			for(int c=0; c<n; c++)
			{
				if(c==0||c==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
	}
	public static void q3()
	{System.out.println("q3");
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0||c==0||c==n-1||r==n-1)
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
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==0||c==n-1||r==n-1)
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
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0||c==n-1||c==0)
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
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0;c<n; c++)
			{
				if(c==r)
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
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r+c==n-1)
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
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r+c==n-1||r==c)
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
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0||r==n-1||r+c==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	public static void q10() 
	{
		System.out.println("q10");
		int n=5;
		for(int r=0; r<n; r++)
		{
			for( int c=0; c<n; c++)
			{
				if(r==0||r==n-1||r==c)
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
	public static void q11()
	{
		System.out.println("q11");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==3||r==3)
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
	public static void q12()
	{
		System.out.println("q12");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==3||r==0||r==n-1||c==0||c==n-1)
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
	public static void q13() 
	{
		System.out.println("q13");
		int n=7; 
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==0||r==n-1||r==c)
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
	public static void q14() 
	{
		System.out.println("q14");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0 ; c<n ; c++)
			{
				if(c==0||r==0||r+c==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	public static void q15() 
	{
		System.out.println("q15");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==n-1||r==n-1||c+r==n-1)
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
	public static void q16() 
	{
		System.out.println("q16");
		int n=7;
		for(int r=0; r<n ; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0||c==n-1||r==c)
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
	public static void q17() 
	{
		System.out.println("q17");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==0||r==0||r==n-1||c==n-1||c==3||r==3)
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
	public static void q18()
	{
		System.out.println("q18");
		int n=7;
		for(int r=0; r<n ; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==r||c+r==n-1||c==0||c==n-1||r==0||r==n-1)
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
		q11();
		System.out.println();
		q12();
		System.out.println();
		q13();
		System.out.println();
		q14();
		System.out.println();
		q15();
		System.out.println();
		q16();
		System.out.println();
		q17();
		System.out.println();
		q18();
		System.out.println();

	}

}
