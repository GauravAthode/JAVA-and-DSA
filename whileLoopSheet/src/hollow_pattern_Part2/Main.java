package hollow_pattern_Part2;

public class Main 
{
	public static void q1()
	{
		System.out.println("Question no.1");
		int n=6;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<11)
			{
				if(r==n-1 || r+c==n-1 || c-r==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public static void q2()
	{
		System.out.println("Question no.2");
		int n=6;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<11)
			{
				if(r==c || c+r==11-1 || r==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public static void q3()
	{
		System.out.println("Question no.3");
		int n=11;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<6)
			{
				if(c==0 || r==c || r+c==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public static void q4()
	{
		System.out.println("Question no.4");
		int n=6;
		int r=0;
		while(r<11)
		{
			int c=0;
			while(c<n)
			{
				if(c==n-1 || r+c==n-1 || r-c==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public static void q5()
	{
		System.out.println("Question no.5");
		int n=11;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c+r==11/2 || c-r==n/2 || r-c==n/2 || r+c==n-1+n/2 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public static void q6()
	{
		System.out.println("Question no.6");
		int n=11;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==0 || c==n-1 || r==c || r+c==n-1 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public static void q7()
	{
		System.out.println("Question no.7");
		int n=11;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c+r==11/2 || c-r==n/2 || r-c==n/2 || r+c==n-1+n/2 |c==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public static void q8()
	{
		System.out.println("Question no.8");
		int n=11;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c+r==11/2 || c-r==n/2 || r-c==n/2 || r+c==n-1+n/2 |r==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public static void q9()
	{
		System.out.println("Question no.9");
		int n=11;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c+r==11/2 || c-r==n/2 || r-c==n/2 || r+c==n-1+n/2 || c==0 || c==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
	public static void q10()
	{
		System.out.println("Question no.10");
		int n=11;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c+r==11/2 || c-r==n/2 || r-c==n/2 || r+c==n-1+n/2 || r==0 || r==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}

	public static void main(String[] args) 
	{
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
	}

}
