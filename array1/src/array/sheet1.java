package array;
import java.util.Scanner;

//write a program to declear, initialize ,and display the elements of an integer array
public class sheet1 
{
	public static void question1(int a[])
	{
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]);
			
		}
	}
	public static void question2(int a[])
	{
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]);
			
		}
	}
	public static void question3(int a[])
	{
		for(int i=a.length-1; i>=0;i--)
		{
			System.out.print(a[i]);
			
		}
		
	}
	public static void question5(int a[])
	{
		for(int i=a.length-1; i<a.length/2;i--)
		{
			System.out.print(a[i]);
			
		}
	}
	public static void question6(int a[])
	{
		for(int i=a.length/2; i>=0;i--)
		{
			System.out.print(a[i]);
			
		}
	}
	public static void question7(int a[])
	{
		for(int i=a.length/2; i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}
	public static void question8(int a[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0; i<a.length;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];	
			}
			System.out.println(min);
		}
	}
	public static void question9(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<max)
			{
				max=a[i];
			}
			System.out.println(max);
			
		}
	}
	
	public static void question11()
	{
		int arr1[]= {1,2,3};
		int arr2[]= {5,6,7};
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]+"  "+arr2[i]);
			
		}
		
	}
	public static void question12()
	{
		int arr[]= {1,2,3};
		int add=0;
		for(int i=0; i<arr.length; i++)
		{
			add=arr[i]+add;
			
		}
		System.out.println(add);	
	}
	
	public static void question13()
	{
		int arr[]= {14,9,6,20,21};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}


	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		question1(a);
		System.out.println();
		question2(a);
		System.out.println();
		question3(a);
		System.out.println();
		question5(a);
		System.out.println();
		question6(a);
		System.out.println();
		question7(a);
		System.out.println();
		question8(a);
		System.out.println();
		question9(a);
		System.out.println();
		question11();
		System.out.println();
		question12();
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println();
//		System.out.println("inter the value : ");
//		int size= sc.nextInt();
//		int x[]=new int [size];
//		//int y[]=new int [size];
		
		
	}

}
//print mini
//print max
//span

//sum of all
//
