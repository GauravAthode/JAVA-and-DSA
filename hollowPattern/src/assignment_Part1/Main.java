package assignment_Part1;

public class Main 
{
	public static void question1()
	{
		System.out.println("Question no.1");
		int n = 5;
		for(int r=0; r<n; r++)
		{
			for (int c=0; c<n; c++)
			{
				if(r==0 || r==n-1)
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
		System.out.println("Question no.2");
		int n = 5;
		for(int r=0; r<n; r++)
		{
			for (int c=0; c<n; c++)
			{
				if(c==0 || c==n-1)
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
		System.out.println("Question no.3");
		int n=6;
		for(int r=1; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==1 || r==n-1 || c==0 || c==n-1)
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
		System.out.println("Question no.4");
		int n=6;
		for(int r=1; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==n-1 || c==0 || c==n-1)
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
		System.out.println("Question no.5");
		int n=6;
		for(int r=1; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==1 || c==0 || c==n-1)
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
		System.out.println("Question no.6");
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==c)
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
		System.out.println("Question no.7");
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
	
	public static void question8() 
	{
		System.out.println("Question no.8");
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==c || r+c==n-1)
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
		System.out.println("Question no.9");
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0 || r==n-1 || r+c==n-1)
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
		System.out.println("Question no.10");
		int n=5;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0 || r==n-1 || r==c)
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
	
	public static void question11() 
	{
		System.out.println("Question no.11");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==3 || c==3)
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
	
	public static void question12() 
	{
		System.out.println("Question no.12");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0 || r==n-1 || c==0 || c==n-1 || c==3)
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
	
	public static void question13() 
	{
		System.out.println("Question no.13");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(c==0 || r==n-1 || r==c)
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
	
	public static void question14() 
	{
		System.out.println("Question no.14");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0 || c==0 || r+c==n-1)
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
	
	public static void question15() 
	{
		System.out.println("Question no.15");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==n-1 || c==n-1 || r+c==n-1)
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
	
	public static void question16() 
	{
		System.out.println("Question no.16");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0 || c==n-1 || r==c)
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
	
	public static void question17() 
	{
		System.out.println("Question no.17");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0 || r==3 || r==n-1 || c==0 || c==3 || c==n-1)
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
	
	public static void question18() 
	{
		System.out.println("Question no.18");
		int n=7;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==0 || r==n-1 || c==0 || c==n-1 || r==c || r+c==n-1)
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
		System.out.println();
		question11();
		System.out.println();
		question12();
		System.out.println();
		question13();
		System.out.println();
		question14();
		System.out.println();
		question15();
		System.out.println();
		question16();
		System.out.println();
		question17();
		System.out.println();
		question18();
		System.out.println();
	}
}
