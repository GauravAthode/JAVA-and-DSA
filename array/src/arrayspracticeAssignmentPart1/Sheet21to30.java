package arrayspracticeAssignmentPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Sheet21to30 
{
//	Que 21. Write a program to find the Square Root and Cube
//	Root of all elements of an array and store the results in two
//	separate arrays. Return the new arrays.
//	Input: arr1 = {1, 4, 9, 16, 25}
//	Output: sqrt = {1, 2, 3, 4, 5}
//	Input: arr2 = {1, 8, 27, 64, 125}
//	Output: cbrt = {1, 2, 3, 4, 5}
	public static int[] question21sqrt(int arr1[])
	{
		System.out.println("Question 21");
		int size =arr1.length;
		int sqrt[]=new int[size];
		for(int i=0; i<size; i++)
		{
			sqrt[i]=(int)Math.sqrt(arr1[i]);
		}
		
		return sqrt;
	}
	public static int[] question21cbrt(int arr2[])
	{
		int size =arr2.length;
		int cbrt[]=new int[size];
		for(int i=0; i<size; i++)
		{
			cbrt[i]=(int)Math.cbrt(arr2[i]);
		}
		
		return cbrt;
	}
	
//	Que 22. Write a program to store only two digit elements of
//	an array in new array. Return the new Array.
	public static int[] question22(int arr[])
	{
		System.out.println("Question22");
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<=99&&arr[i]>=10)
			{
				count++;
			}
		}
		int arr1[]=new int[count];
		int index=0;
		for(int i=0 ; i<arr.length;i++)
		{
			if(arr[i]<=99&&arr[i]>=10)
			{
				arr1[index]=arr[i];
				index++;
			}		
		}
		return arr1;	
	}
	
//	Que 23. Write a program to print the number of digits
//	present in every integer element of an array.
//	Input: arr = {22, 309, 4, 55}
//	Output: 22 is a 2 digit number
//	 309 is a 3 digit number
//	 4 is a 1 digit number
//	 55 is a 2 digit number
	public static void question23()
	{
		System.out.println("Question23");
		Scanner sc= new Scanner(System.in);
		System.out.println("input total length of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input array element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0 ; i<arr.length; i++)
		{
			int orignal=arr[i];
			int count=0;
			while(arr[i]>0)
			{
				 arr[i]/=10;
				count++;
			}
			System.out.println(orignal+"is a "+count+" digit number");	
		}		
	}
	
//	Que 24. Write a program to find and store the prime
//	elements of an array in a new array. The program should
//	return the new array containing only the prime numbers.
//	Input: arr = {11,22,33,41,59}
//	Output: prime = {11, 41, 59,}
	public static int[] question24(int arr[])
	{
		System.out.println("Question24");
		int totalPrime=0;
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
			if(arr[i]>=1)
			{
				for(int j=1; j<=arr[i];j++)
				{
					if(arr[i]%j==0)
					{
						count++;
					}
				}
			}
			if(count==2)
			{
				totalPrime++;
			}
		}
		
		int prime[]=new int[totalPrime];
		{
			int index=0;
			for(int i=0; i<arr.length; i++)
			{
				int count=0;
				if(arr[i]>=1)
				{
					for(int j=1; j<=arr[i];j++)
					{
						if(arr[i]%j==0)
						{
							count++;
						}
					}
				}
				if(count==2)
				{
					prime[index]=arr[i];
					index++;
				}
			}
		}
		return prime;
	}
	
//	Que 25. Write a program to find whether the given element
//	is present in an array or not.
//	Input: arr = {11, 21, 31, 41, 51}
//	num = 31
//	Output: Yes
	public static void question25()
	{
		System.out.println("Question25");
		System.out.println("input total length of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input element of array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("enter num = ");
		int num=sc.nextInt();
		for(int i=0; i<size; i++)
		{
			if(num==arr[i])
			{
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
	
//	Que 26. Write a program to print the number of occurrence
//	of a given element in an array.
//	Input: arr = {1, 2, 3, 3, 6, 3, 5, 3}
//	num = 3
//	Output: 4 
	public static void question26()
	{
		System.out.println("Question26");
		Scanner sc=new Scanner(System.in);
		System.out.println("input total length of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("input element of array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("enter num = ");
		int num=sc.nextInt();
		int count =0;
		for(int i=0; i<size; i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
//	Que 27. Write a program to print the number of occurrence
//	of every element in an array.
//	Input: arr = {1, 5, 2, 5, 2, 2, 1, 6}
//	output: Occurrence of 1 is 2
//	        Occurrence of 5 is 2
//	        Occurrence of 2 is 3
//	        Occurrence of 6 is 1
	public static void question27()
	{

	
	}
	
//	Que 28. Write a program to find and store the sum of
//	elements of 2 arrays Index wise in a new array. Return the
//	new array.(both the arrays should have equal number of
//	elements)
//	Input: arr1 = {10, 20, 30, 40}
//	 arr2 = {1, 2, 3, 4}
//	Output: sum = {11, 22, 33, 44}
	public static int[] question28(int arr1[],int arr2[])
	{
		System.out.println("Question28");
		int sum[]=new int[arr1.length];
		for(int i=0; i<arr1.length;i++)
		{
			sum[i]=arr1[i]+arr2[i];
		}
		return sum;
	}
	
//	Que 29. Write a program to find and store the product of
//	elements of 2 arrays Index wise in a new array. Return the
//	new array.(both the arrays should have equal number of
//	elements)
//	Input: arr1 = {10, 20, 30, 40}
//	 arr2 = {1, 2, 3, 4}
//	Output: 10 40 90 160
	public static int [] question29(int arr1[],int arr2[])
	{
		System.out.println("Question29");
		int newArray[]=new int [arr1.length];
		for(int i=0; i<arr1.length; i++)
		{
			newArray[i]=arr1[i]*arr2[i];
		}
		 return newArray;
	}
	
//	Que 30. Write a program to calculate the sum and product of
//	the elements of two arrays, both the arrays should have
//	unequal numbers of elements. For indexes where elements
//	are not present in one of the arrays, simply print the
//	remaining elements of the longer array as they are. The
//	results should be stored in new arrays and returned.
//	Input: arr1 = {10, 20, 30, 40, 50}
//	 arr2 = {1, 2, 3}
//	Output: Sum: {11, 22, 33, 40, 50}
//	 Product: {10, 40, 90, 40, 50} 
	public static int[] question30sum(int arr1[],int arr2[])
	{
		int max=Math.max(arr1.length,arr2.length);
				
		int sum[]=new int[max];
		for(int i=0; i<max;i++)
		{
			if(i<arr1.length&&i<arr2.length)
			{
				sum[i]=arr1[i]+arr2[i];
			}
			else if(i<arr1.length)
			{
				sum[i]=arr1[i];
			}
			else 
			{
				sum[i]=arr2[i];
			}	
		}
		return sum;
	}
	public static int[] question30porduct(int arr1[],int arr2[])
	{
		int max=Math.max(arr1.length,arr2.length);
				
		int product[]=new int[max];
		for(int i=0; i<max;i++)
		{
			if(i<arr1.length&&i<arr2.length)
			{
				product[i]=arr1[i]*arr2[i];
			}
			else if(i<arr1.length)
			{
				product[i]=arr1[i];
			}
			else 
			{
				product[i]=arr2[i];
			}	
		}
		return product;
	}

	public static void main(String[] args) 
	{
//		Que 21.
		//int arr1[]= {1,4,9,16,25};
		//int result1[]=question21sqrt(arr1);
		//System.out.print("Sqrt = ");
		//for(int i=0;i<arr1.length; i++)
		//{
			//System.out.print(result1[i]+" ");
		//}
		//System.out.println();
		//int arr2[]= {1,8,27,64,125};
		//int result2[]=question21cbrt(arr2);
		//System.out.print("Cbrt = ");
		//for(int i=0;i<arr2.length; i++)
		//{
			//System.out.print(result2[i]+" ");
		//}
		
		
//		Que 22. 
        //int arr[]= {1,22,309,4,55};
		//int result[] =question22(arr);
		//System.out.print("arr = ");
		//int count=0;
		//for(int i=0; i<arr.length;i++)
		//{
		//	if(arr[i]<=99&&arr[i]>=10)
		//	{
		//		count++;
		//	}
		//}
		//for(int i=0; i<count;i++)
		//{
		//	System.out.print(result[i]+"  ");
		//}	
		
		
//		Que 23. 
		//question23();
		
		
//		Que 24. 
		//int arr[]= {11,22,33,41,59};
		//int result[]= question24(arr);
		//for(int i=0; i<4; i++)
		//{
			//System.out.println(result[i]);
		//}
		
		
//		Que 25. 
		//question25();
		
		
//		Que 26. 
		//question26();
		
		
//	    Que 27. Write a program to print the number of occurrence
//		of every element in an array.
		//question27();
		
		
//		Que 28.
		//int arr1[]= {10,20,30,40};
		//int arr2[]= {1,2,3,4};
		//int result[]=question28(arr1,arr2);
		//System.out.print("sum = ");
		//for(int i=0; i<arr1.length;i++)
		//{
		    //System.out.print(result[i]+" ");
		//}
		
		
//		Que 29.
//		int arr1[]= {10,20,30,40};
//		int arr2[]= {1,2,3,4,};
//		int result[]=question29(arr1,arr2);
//		for(int i=0; i<arr1.length; i++)
//		{
//			System.out.print(result[i]+" ");
//		}
		
		
//		Que 30.
		//int arr1[]= {10,20,30,40,50};
		//int arr2[]= {1,2,3};
		//int maxlength=Math.max(arr1.length,arr2.length);
		//int result1[]=question30sum(arr1,arr2);
		//System.out.print("Sum : ");
		//for(int i=0; i<maxlength; i++)
		//{
			//System.out.print(result1[i]+" ");
		//}
		//System.out.println();
		//int result2[]=question30porduct(arr1,arr2);
		//System.out.print("Product : ");
		//for(int i=0; i<maxlength; i++)
		//{
			//System.out.print(result2[i]+" ");
		//}

	}

}
