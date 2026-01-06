package bubbleSortAsiignment;

import java.util.*;
public class Main 
{
	public static int[] increasingbubbleSort(int arr[])
	{
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++ )
		{
			for(int j=0;j<arr.length-1-i;j++ )
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag)
			{
				break;
			}
		}
		return arr;
	}
	public static int[] decreasingbubbleSort(int arr[])
	{
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++ )
		{
			for(int j=0;j<arr.length-1-i;j++ )
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag)
			{
				break;
			}
		}
		return arr;
	}
	
//	Que 1. Write a program to sort an array in nondecreasing order (ascending order) using the Bubble
//	Sort algorithm.
//	Example
//	Input: arr = {12, 8, 15, 6, 10}
//	Output: arr = {6, 8, 10, 12, 15}
//	Explanation:
//	• In the first pass, the largest number (15) moves to
//	its correct position at the end.
//	• In the second pass, the second-largest number
//	(12) moves to its correct position.
//	• Similarly, the remaining elements are sorted in
//	subsequent passes.
	public static void question1()
	{
		System.out.println("Qurstion1");
		int arr[]= {12,34,23,43,10};
		increasingbubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 2. Write a program to sort an array in decreasing
//	order using the Bubble Sort algorithm.
//	Example
//	Input: arr = {12, 8, 15, 6, 10}
//	Output: arr = {15, 12, 10, 8, 6}
//	Explanation:
//	• In the first pass, the smallest number (6) moves to
//	the end.
//	• In the second pass, the next smallest number (8)
//	moves to the second last position.
//	• This continues until all elements are sorted in
//	decreasing order.
//	Input: arr = {0, -3, 4, -1, 2}
//	Output: arr = {4, 2, 0, -1, -3}
//	Explanation: The positive and negative numbers are
//	arranged in decreasing order, with the largest value (4)
//	at the beginning and the smallest value (-3) at the end.
	public static void question2()
	{
		System.out.println("Qurstion2");
		int arr[]= {0,-3,4,-1,2};
		decreasingbubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 3. Sort only the first k elements of an array in
//	ascending order using Bubble Sort, leaving the rest of
//	the array unsorted.
//	Example
//	Input: {9, 3, 7, 5, 8, 1}, k = 4
//	Output: {3, 5, 7, 9, 8, 1}
//	Explanation: Sort the first 4 elements {9, 3, 7, 5} of the
//	array in ascending order to get {3, 5, 7, 9}, leaving the
//	remaining elements {8, 1} unchanged.
	public static void question3(int arr[],int k)
	{
		System.out.println("Qurstion3");
		boolean flag=true;
		for(int i=0;i<k-1;i++ )
		{
			for(int j=0;j<k-1-i;j++ )
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 4. Write a program to count the minimum number
//	of swaps required to sort an array using Bubble Sort.
//	Example
//	Input: {4, 3, 1, 2}
//	Output: 5
//	Explanation: The minimum number of swaps required
//	to sort the array {4, 3, 1, 2} using Bubble Sort is 5.
	public static void question4(int arr[])
	{
		System.out.println("Qurstion4");
		System.out.println("minimum number of swap required : ");
		System.out.println(Arrays.toString(arr));
		boolean flag=true;
		int count=0;
		for(int i=0;i<arr.length-1;i++ )
		{
			for(int j=0;j<arr.length-1-i;j++ )
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
					flag=false;
				}
			}
			if(flag)
			{
				break;
			}
		}
		System.out.println(count);
	}
	
//	Que 5. Write a program that uses Bubble Sort to find
//	the kth largest element in the array. After sorting the
//	array using Bubble Sort, return the kth largest element.
//	Example
//	Input: {10, 20, 15, 30, 40}, k = 3
//	Output: 20
//	Explanation: Sort the array in ascending order first:
//	{10, 15, 20, 30, 40} and return the 3rd largest element
//	(20).
	public static int question5(int arr[],int k)
	{
		System.out.println("Qurstion5");
		System.out.println(k+"th largest of an array");
		System.out.println(Arrays.toString(arr));
		decreasingbubbleSort(arr);
		int count=1;
		int i=0;
		int j=i+1;
		while(j<arr.length)
		{
			if(arr[i]!=arr[j])
			{
				count++;
			}
			i++;
			j++;
			if(count==k)
			{
				return arr[i];
			}
		}
		return-1;
	}
	
//	Que 6. Given an integer array nums sorted in nondecreasing order, return an array of the squares of
//			each number sorted in non-decreasing order.
//			Example
//			Input: nums = [-4,-1,0,3,10]
//			Output: [0,1,9,16,100]
//			Explanation: After squaring, the array becomes
//			[16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
	public static void question6(int arr[])
	{
		System.out.println("Question6");
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length;i++)
		{
			arr[i]*=arr[i];
		}
		System.out.println("squares of each number in sorted");
		System.out.println(Arrays.toString(increasingbubbleSort(arr)));

	}
	
//	Que 7. You are given an array of strings names, and an
//	array heights that consists of distinct positive integers.
//	Both arrays are of length n.
//	For each index i, names[i] and heights[i] denote the
//	name and height of the i
//	th person.
//	Return names sorted in descending order by the
//	people's heights.
//	Example
//	Input: names = ["Mary","John","Emma"],
//	heights = [180,165,170]
//	Output: ["Mary","Emma","John"]
//	Explanation: Mary is the tallest, followed by Emma and
//	John.
	public static String[] question7(String names[],int heights[])
	{
		System.out.println("Question7");
		boolean flag=true;
		for(int i=0; i<heights.length-1;i++)
		{
			for(int j=0; j<heights.length-1-i;j++)
			{
				if(heights[j]<heights[j+1])
				{
					int temp=heights[j+1];
					heights[j+1]=heights[j];
					heights[j]=temp;
					
					String name=names[j+1];
					names[j+1]=names[j];
					names[j]=name;
					
					flag=false;
				}
			}
			if(flag)
			{
				break;
			}
		}
		return names;
	}
	
//	Que 8. Given an array nums with n objects colored red,
//	white, or blue, sort them in-place so that objects of the
//	same color are adjacent, with the colors in the order
//	red, white, and blue.
//	We will use the integers 0, 1, and 2 to represent the
//	color red, white, and blue, respectively.
//	Example
//	Input: nums = [2,0,2,1,1,0]
//	Output: [0,0,1,1,2,2]
//	Explanation: The array is sorted in increasing order,
//	where 0 represents red, 1 represents white, and 2
//	represents blue.
//	Input: nums = [2,0,1]
//	Output: [0,1,2]
//	Explanation: The array is sorted in increasing order,
//	where 0 represents red, 1 represents white, and 2
//	represents blue.
	public static void question8(int arr[])
	{
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++ )
		{
			for(int j=0;j<arr.length-1-i;j++ )
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));	
	}
	
//	Que 9. Implement an optimized version of Bubble Sort
//	that stops the sorting process early if no swaps are
//	made during a complete pass through the array,
//	indicating that the array is already sorted.
//	Example
//	Input: arr = {1, 2, 3, 4, 5}
//	Output: Array is Sorted
//	Explanation: The sorting gets eliminated early(in the
//	first pass only) as there is no need of swapping the
//	elements.
	public static void question9(int arr[])
	{
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++ )
		{
			for(int j=0;j<arr.length-1-i;j++ )
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
//	Que 10. You are given an array of integers. Your task is
//	to sort only the odd elements of the array using the
//	Bubble Sort algorithm while keeping the even elements
//	in their original positions. After sorting the odd
//	elements, the array should remain in the same order
//	except for the odd elements which should be sorted in
//	ascending order.
//	Example
//	Input: arr = [2, 5, 3, 8, 7, 6]
//	Output: [2, 3, 5, 8, 7, 6]
	public static int[] question10(int arr[]) 
	{
	    for (int i = 0; i < arr.length - 1; i++) 
	    {
	        boolean flag = true;

	        for (int j = 0; j < arr.length - 1 - i; j++) 
	        {
	            int first = j;
	            int second = first + 1;
	            while (first<arr.length&&arr[first]%2== 0) 
	            {
	                first++;
	            }
	            while (second<arr.length&&arr[second]%2==0) 
	            {
	                second++;
	            }
	            if (second>=arr.length||first>=arr.length) 
	            {
	                break;
	            }
	            if (arr[first]>arr[second]) 
	            {
	                int temp=arr[first];
	                arr[first]=arr[second];
	                arr[second]=temp;
	                flag=false;
	            }
	        }
	        if(flag) 
	        {
	            break; 
	        }
	    }

	    return arr;
	}

	


	
	
	public static void main(String[] args) 
	{
//		int arr[]= {12,8,15,6,10};
//		increasingbubbleSort(arr);
//		decreasingbubbleSort(arr);
		
		
//		Que1.
		//question1();
		
		
//		Que2.
		//question2();
		
		
//		Que3.
//		int arr[]= {9,3,7,5,8,1};
//		int k=4;
//		question3(arr,k);
		
		
//		Que4.
//		int arr[]= {4,3,1,2};
//		question4(arr);
		
		
//		Que5.
//		int arr[]= {65,35,16,15,56,56};
//		int k=3;
//		System.out.println(question5(arr,k));
		
		
//		Que6.
//		int arr[]= {-4,-1,0,3,10};
//		question6(arr);
		
		
//		Que7.
//		String names[]= {"Mary","John","Emma"};
//		int heights[]= {180,165,170};
//		System.out.println(Arrays.toString(question7(names,heights)));
		
		
//		Que8.
//		int arr[] ={1,0,3,3,0,1};
//		question8(arr);
		
		
//		Que9.
//		int arr[]= {1,2,3,4,5};
//		question9(arr);
		
		
		
//		Que10.
//		int arr[]= {2,5,3,8,7,6};
//		System.out.println(Arrays.toString(question10(arr)));
		
		

		
		

	}
}
