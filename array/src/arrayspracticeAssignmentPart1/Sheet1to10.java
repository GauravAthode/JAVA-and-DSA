package arrayspracticeAssignmentPart1;

import java.util.*;                        

public class Sheet1to10 
{
//	Que 1. Write a program to declare, initialize, and display the
//	elements of an integer array.
	public static void question1()
	{
		System.out.println("Question1");
		int arr[]= {1,2,3,4,5};
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
//	Que 2. Write a program to take an array of integers and
//	traverse it from start to end. Display all the elements of the
//	array.
//	Input: arr = {1, 2, 3, 4, 5}
//	Output: 1 2 3 4 5
	public static void question2()
	{
		System.out.println("Question2");

		System.out.println("input total lenght of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
//	Que 3. Write a program to take an array of integers and
//	traverse it from end to start. (also known as Reverse
//	Traversing)
//	Input: arr = {1, 2, 3, 4, 5}
//	Output: 5 4 3 2 1
	public static void question3()
	{
		System.out.println("Question3");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
//	Que 4. Write a program to take an array and traverse it from
//	start to half.
//	Input: arr = {1, 2, 3, 4, 5, 6}
//	Output: 1 2 3
	public static void question4()
	{
		System.out.println("Question4");
		System.out.println("input total length of array");
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0;i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<size/2;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
//	Que 5. Write a program to take an array and traverse it from
//	end to half.
//	Input: arr = {1, 2, 3, 4, 5, 6}
//	Output: 6 5 4
	public static void question5()
	{
		System.out.println("Question5");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=size-1; i>=size/2;i--)
		{
			System.out.print(arr[i]);
		}
	}
	
//	Que 6. Write a program to take an array and traverse it from
//	half to start.
//	Input: arr = {1, 2, 3, 4, 5, 6}
//	Output: 3 2 1
	public static void question6()
	{
		System.out.println("Question6");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=size/2-1; i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
	
//	Que 7. Write a program to take an array and traverse it from
//	half to end.
//	Input: arr = {1, 2, 3, 4, 5, 6}
//	Output: 4 5 6
	public static void question7()
	{
		System.out.println("Question7");
		System.out.println("input total length of array");
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input arr element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=size/2;i<size; i++)
		{
			System.out.print(arr[i]);
		}
	}
	
//	Que 8. Write a program to print minimum element of an
//	array.
//	Input: arr = {5, 7, 3, 9, 4}
//	Output: 3
	public static void question8()
	{
		System.out.println("Question8");
		System.out.println("input total length of array");
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		for(int i=0; i<size;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	
//	Que 9. Write a program to print maximum element of an
//	array.
//	Input: arr = {5, 7, 3, 9, 4}
//	Output: 9
	public static void question9()
	{
		System.out.println("Question9");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0; i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
//	Que 10. Write a program to print span of an array.
//	Input: arr = {5, 7, 3, 9, 4}
//	Output: maximum element: 9, minimum element: 3
//	 span = 9-3 = 6
	public static void question10()
	{
		System.out.println("Question10");
		System.out.println("input total length of array");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array elememt");
		for(int i=0; i<size; i++ )
		{
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int i=0; i<size;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		int result=max-min;
		System.out.println(result);
	}
	
	public static void main(String[] args)
	{
//		Que 1.
		//question1();
		
		
//		Que 2. 
		//question2();
		
		
//		Que 3.
		//question3();
		
		
//		Que 4.
		//question4();
		
		
//		Que 5.
		//question5();
		
		
//		Que 6.
		//question6();
		
		
//		Que 7. 
		//question7();
		
		
//		Que 8. 
		//question8();
		
		
//		Que 9.
		//question9();
		
		
//		Que 10.
		//question10();
		
	}
}
