package pack1;

public class hcf
{
	public static int hcf(int a , int b)
	{
		if(a<b)
		{
			for(int i=a;i>=1;i--)
			{
				if(a%i==0&&b%i==0)
				{
					return i;
				}
			}
		}
		else
		{
			for(int i=b;i>=1;i--)
			{
				if(a%i==0&&b%i==0)
				{
					return i;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		int a=12;
		int b=13;
		System.out.println(hcf(a, b));

	}

}
