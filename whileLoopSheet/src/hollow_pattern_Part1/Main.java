package hollow_pattern_Part1;

public class Main 
{
	public static void q1()
	{
		System.out.println("Question no.1");
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(r==0 || r==n-1)
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
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==0 || c==n-1)
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
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==0 || c==n-1 ||r==0||r==n-1)
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
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==0 || c==n-1 ||r==n-1)
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
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==0 ||r==0||c==n-1)
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
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==r)
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
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(r+c==n-1)
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
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(r+c==n-1 || r==c)
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
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(r+c==n-1 || r==0 || r==n-1)
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
		int n=5;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(r==n-1 || r==0 || r==c)
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
	
	public static void q11()
	{
		System.out.println("Question no.11");
		int n=7;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(r==3 || c==3)
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
	
	public static void q12()
	{
		System.out.println("Question no.12");
		int n=7;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==0 || r==0 ||r==n-1 || c==n-1 || c==3)
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
	
	public static void q13()
	{
		System.out.println("Question no.13");
		int n=7;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==0 || r==n-1 ||r==c)
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
	
	public static void q14()
	{
		System.out.println("Question no.14");
		int n=7;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==0 || r==0 ||r+c==n-1)
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
	
	public static void q15()
	{
		System.out.println("Question no.15");
		int n=7;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==n-1 || r==n-1 ||r+c==n-1)
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
	
	public static void q16()
	{
		System.out.println("Question no.16");
		int n=7;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==n-1 || r==n-1 ||r+c==n-1)
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
	
	public static void q17()
	{
		System.out.println("Question no.17");
		int n=7;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==n-1 || r==n-1 ||r==0 || c==0 || r==3 || c==3)
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
	
	public static void q18()
	{
		System.out.println("Question no.18");
		int n=7;
		int r=0;
		while(r<n)
		{
			int c=0;
			while(c<n)
			{
				if(c==n-1 || r==n-1 ||r==0 || c==0 || r+c==n-1 || r==c)
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
		q11();
		q12();
		q13();
		q14();
		q15();
		q16();
		q17();
		q18();
		
	}

}
