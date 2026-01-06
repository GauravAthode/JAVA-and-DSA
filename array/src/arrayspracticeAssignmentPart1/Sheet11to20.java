package arrayspracticeAssignmentPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Sheet11to20 
{
//	Que 11. Write a program to print 2 arrays together using
//	single for loop.
//	Input: arr1 = {1, 2, 3, 4} arr2 = {5, 6, 7, 8}
//	Output: 1 5
//	 2 6
//	 3 7
//	 4 8
	public static void question11()
	{
		System.out.println("Question 11");
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8};
		for(int i=0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]+" "+arr2[i]);
		}
	}
	
//	Que 12. Write a program to print the sum of all elements in a
//	given array.
//	Input: arr = {1, 2, 3, 4, 5}
//	Output: 15
	public static void question12()
	{
		System.out.println("Question12");
		System.out.println("input total length of array");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array elememt");
		for(int i=0; i<size; i++ )
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<size; i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	
//	Que 13. Write a program to create a new array containing
//	only the even elements of a given array. The program should:
//	1. Take an input array of integers.
//	2. Create a new array to store only the even elements from
//	the input array.
//	3. Return the new array and display its contents.
//	Input: arr = {14, 9, 6, 20, 35}
//	Output: evenArr = {14, 6, 20}
	public static void question13()
	{
		System.out.println("Question13");
		System.out.println("enter size of array");
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter element of array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		int evenarr[]=new int[count];
		int index=0;
		for(int i=0;i<size; i++)
		{
			if(arr[i]%2==0)
			{
				evenarr[index]=arr[i];
				index++;
			}
		}
		System.out.println("evenarray");
		for(int i=0;i<count;i++)
		{
			System.out.println(evenarr[i]);
		}
	}
	
//	Que 14. Write a program to create a new array containing
//	only the odd elements of a given array. The program should:
//	1. Take an input array of integers.
//	2. Create a new array to store only the odd elements from
//	the input array.
//	3. Return the new array and display its contents.
//	Input: arr = {14, 9, 6, 20, 35}
//	Output: oddArr = {9, 35}
	public static void question14()
	{
		System.out.println("Question14");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
	    for(int i=0; i<size; i++)
	    {
	    	if(arr[i]%2==1)
	    	{
	    		count++;
	    	}
	    }
	    int oddarr[]=new int[count];
	    int index=0;
	    for(int i=0; i<size;i++)
	    {
	    	if(arr[i]%2==1)
	    	{
	    		oddarr[index]=arr[i];
	    		index++;
	    	}
	    }
	    System.out.println("odd array");
	    for(int i=0; i<count; i++)
	    {
	    	System.out.println(oddarr[i]);
	    }
	}
	
//	Que 15. Write a program to print Sum of only even elements
//	of an array.
//	Input : arr = {1, 2, 3, 4, 5}
//	Output: sum = 6
	public static void question15()
	{
		System.out.println("Question15");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);	
	}
	
//	Que 16. Write a program to print Sum of only odd elements
//	of an array.
//	Input : arr = {1, 2, 3, 4, 5}
//	Output: sum = 9
	public static void question16()
	{
		System.out.println("Question16");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==1)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
	
//	Que 17. Write a program to print product of only even
//	elements of an array.
//	Input : arr = {1, 2, 3, 4, 5}
//	Output: product = 8
	public static void question17()
	{
		System.out.println("Question17");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int product=1;
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==0)
			{
				product*=arr[i];
			}
		}
		System.out.println(product);	
	}
	
//	Que 18. Write a program to print product of only odd
//	elements of an array.
//	Input : arr = {1, 2, 3, 4, 5}
//	Output: product = 15
	public static void question18()
	{
		System.out.println("Question18");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int product=1;
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==1)
			{
				product*=arr[i];
			}
		}
		System.out.println(product);
	}
	
//	Que 19. Write a program to count the number of even and
//	odd elements in an array.
//	Input: arr = {1, 2, 3, 4, 5}
//	Output: even=2, odd=3
	public static void question19()
	{
		System.out.println("Question19");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int evenCount=0;
		int oddCount=0;
		for(int i=0 ; i<size; i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
		}
		for(int i=0 ; i<size; i++)
		{
			if(arr[i]%2==1)
			{
				oddCount++;
			}
		}
		
		System.out.println("even = "+evenCount+" , "+"odd = "+oddCount);
	}
	
//	Que 20. Write a program to find the Square and Cube of all
//	elements of an array and store the results in two separate
//	arrays. Return the new arrays.
//	Input: arr = {1, 2, 3, 4, 5}
//	Output: Square = {1, 4, 9, 16, 25}
//	 Cube = {1, 8, 27, 64, 125}
	public static int[] square(int arr[])
	{
		int square[]=new int[arr.length];
		for(int i=0;i<arr.length; i++)
		{
			square[i]=arr[i]*arr[i];
		}
		return square;	
	}
	
	public static int[] cube(int arr[])
	{
		int cube[]=new int[arr.length];
		for(int i=0;i<arr.length; i++)
		{
			cube[i]=arr[i]*arr[i]*arr[i];
		}
		return cube;
		
	}
	
	public static void question20(int arr[])
	{
		System.out.println("Question20");
		System.out.print("Square = ");
		System.out.println(Arrays.toString(square(arr)));
		
		System.out.print("Cube =");
		System.out.println(Arrays.toString(cube(arr)));
	}

	public static void main(String[] args) 
	{
//		Que 11. 
		//question11();
		
		
//		Que 12. 
		//question12();
		
		
//		Que 13.
		//question13();
		
		
//		Que 14.
		//question14();
		
		
//		Que 15.
		//question15();
		
		
//		Que 16.
		//question16();
		
		
//		Que 17.
		//question17();
		
		
//		Que 18.
		//question18();
		
		
//		Que 19. 
		//question19();
		
		
//		Que 20. 
		int arr[]= {1,2,3,4,5};
		question20(arr);	
		

	}

}
