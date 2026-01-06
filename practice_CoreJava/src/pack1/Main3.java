package pack1;

import java.lang.module.FindException;

import javax.swing.LayoutStyle;

public class Main3 
{
	public static int lastPrime(int n)
	{
		if (n <= 1)
		{
			return 0;
		}
		
		int count=0;
		while(count<=n)
		{
			count=num(count,n);
		}
		return count;
	
        
	}
	public static int num(int count,int n)
	{
		for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0)
            {
            	return count;
            }
        }
		System.out.println(2);
		return count++;
	}

	public static void main(String[] args) 
	{
		int n=5;
		System.out.println(lastPrime(n));

	}

}
