package starpattern_part1;

public class Main 
{
	public static void q1()
	{
        System.out.println("q1");
		int a=0;
		while(a<1)
		{
			int j=0;
			while(j<5)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			a++;
		}
	}
	
	public static void q2()
	{
		System.out.println("q2");
		int c=0;
		while(c<1)
		{
			int j=0;
			while(j<5)
			{
				System.out.println("* ");
				j++;
			}
			System.out.println();
			c++;
		}
	}
	
	public static void q3()
	{
		System.out.println("q3");
		int d=0;
		while(d<5)
		{
			int j=0;
			while(j<6)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			d++;
		}
	}
	
	public static void q4()
	{
		System.out.println("q4");
		int e=0;
		while(e<5)
		{
			int j=0;
			while(j<5)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			e++;
		}
	}
	
	public static void q5()
	{
		System.out.println("q5");
		int i=0;
		while(i<5)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q6()
	{
		System.out.println("q6");
		int i=0;
		while(i<5)
		{
			int j=i;
			while(j<5)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q7()
	{
		System.out.println("q7");
		int i=0;
		while(i<5)
		{
			int j=0;
			while(j<i)
			{
				System.out.print("  ");
				j++;
			}
			
			int a=i;
			while(a<5)
			{
				System.out.print("* ");
				a++;
			}
			System.out.println();
			i++;
		}	
	}
	
	public static void q8()
	{
		System.out.println("q8");
		int i=0;
		while(i<5)
		{
			int j=i;
			while(j<4)
			{
				System.out.print("  ");
				j++;
			}
			
			int a=0;
			while(a<=i)
			{
				System.out.print("* ");
				a++;
			}
			
			
			System.out.println();
			i++;
		}
	}
	
	public static void q9()
	{
		System.out.println("q9");
		int i=0;
		while(i<5)
		{
			int j=i;
			while(j<4)
			{
				System.out.print("  ");
				j++;
			}
			
			int a=0;
			while(a<=i)
			{
				System.out.print("* ");
				a++;
			}
			
			int b=0;
			while(b<i)
			{
				System.out.print("* ");
				b++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q10()
	{
		System.out.println("q10");
		int i=0;
		while(i<5)
		{
			int j=0;
			while(j<i)
			{
				System.out.print("  ");
				j++;
			}
			
			int a=i;
			while(a<5)
			{
				System.out.print("* ");
				a++;
			}
			
			int b=i;
			while(b<4)
			{
				System.out.print("* ");
				b++;
			}
			System.out.println();
			i++;
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
	

