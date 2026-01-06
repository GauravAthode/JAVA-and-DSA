package selectionSortAsignment;

import java.util.Arrays;

public class Main 
{
	public static void selectionSortincreasing(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSortdecreasing(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 1. Write a program to sort an array in nondecreasing(increasing) order using Selection Sort.
//	Example
//	Input: arr = [45, 12, 89, 23, 5, 67]
//	Output: [5, 12, 23, 45, 67, 89]
//	Explanation: The algorithm repeatedly finds the
//	smallest element from the unsorted portion of the
//	array and swaps it with the first unsorted element. This
//	continues until the entire array is sorted in nondecreasing (ascending) order.
	public static void question1(int arr[])
	{
		for(int i=0; i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 2. Write a program to sort an array in decreasing
//	order using Selection Sort.
//	Example
//	Input: [10, 50, 1, 29, 32, 12, 43]
//	Output: [50, 43, 32, 29, 12, 10, 1]
//	Explanation: In this case, Selection Sort repeatedly
//	finds the largest element from the unsorted part of the
//	array and swaps it with the first unsorted element,
//	continuing the process until the entire array is sorted in
//	decreasing order.

	public static void question2(int arr[])
	{
		for(int i=0; i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]<arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 3. You are given an array of integers and a positive
//	integer k. Use the Selection Sort algorithm to find the
//	Kth smallest element in the array.
//	Input: arr = [7, 10, 4, 3, 20, 15], k = 3
//	Output: 7
//	Explanation: After sorting the array in ascending order
//	using Selection Sort, the array becomes [3, 4, 7, 10, 15,20].
//	The 3rd smallest element is 7.
	public static void question3(int arr[],int k)
	{
		System.out.println("Question3");
		for(int i=0; i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(arr[k-1]);
	}
	
//	Que 4. Given two arrays: one with student names and
//	another with their scores, sort the students by their
//	scores using Selection Sort.
//	Example
//	Input: names = ["Alice", "Bob", "Charlie"], scores = [50,
//	80, 70]
//	Output: ["Alice", "Charlie", "Bob"]
//	Explanation: The students are sorted by their scores in
//	descending order, resulting in ["Bob", "Charlie",
//	"Alice"] based on the association between scores and
//	names.
	public static void question4(String names[],int scores[])
	{
		System.out.println("Question4");
		for(int i=0; i<scores.length-1; i++)
		{
			int min=i;
			for(int j=i+1;j<scores.length; j++)
			{
				if(scores[min]>scores[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=scores[i];
				scores[i]=scores[min];
				scores[min]=temp;
				
				String name=names[i];
				names[i]=names[min];
				names[min]=name;
			}
		}
		System.out.println(Arrays.toString(names));	
	}
	
//	Que 5. Sort only the elements at even indices of the
//	array in ascending order using Selection Sort, while
//	keeping the odd-indexed elements unchanged.
//	Example
//	Input: arr = [4, 1, 7, 2, 3, 5]
//	Output: [3, 1, 4, 2, 7, 5]
//	Explanation: The even-indexed elements [4, 7, 3] are
//	sorted as [3, 4, 7], while the odd-indexed elements [1,
//	2, 5] remain unchanged.
	public static void question5(int arr[])
	{
		for(int i=0; i<arr.length-1; i+=2)
		{
			int min=i;
			for(int j=i+2; j<arr.length;j+=2)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));	
	}
	
//	Que 6. Sort Even and Odd Indices Independently
//	You are given a 0-indexed integer array nums.
//	Rearrange the values of nums according to the
//	following rules:
//	1. Sort the values at odd indices of nums in nonincreasing order.
//	• For example, if nums = [4,1,2,3] before this
//	step, it becomes [4,3,2,1] after. The values at
//	odd indices 1 and 3 are sorted in nonincreasing order.
//	2. Sort the values at even indices of nums in nondecreasing order.
//	• For example, if nums = [4,1,2,3] before this
//	step, it becomes [2,1,4,3] after. The values at
//	even indices 0 and 2 are sorted in nondecreasing order.
//	Return the array formed after rearranging the values
//	of nums.
//	Example
//	Input: nums = [4,1,2,3]
//	Output: [2,3,4,1]
	public static void question6(int arr[])
	{
		System.out.println("Question6");
		for(int i=1; i<arr.length-1; i+=2)
		{
			int min=i;
			for(int j=i+2; j<arr.length;j+=2)
			{
				if(arr[min]<arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		
		for(int i=0; i<arr.length-1; i+=2)
		{
			int min=i;
			for(int j=i+2; j<arr.length;j+=2)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));	
	}
	
//	Que 7. Given an array of integers nums, sort the array
//	in increasing order based on the frequency of the
//	values. If multiple values have the same frequency,
//	sort them in decreasing order.
//	Return the sorted array.
//	Example
//	Input: nums = [1,1,2,2,2,3]
//	Output: [3,1,1,2,2,2]
//	Explanation: '3' has a frequency of 1, '1' has a
//	frequency of 2, and '2' has a frequency of 3.
	public static void question7(int arr[])
	{
		System.out.println("Question7");
		for(int i=0; i<arr.length-1; i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length; j++)
			{
				int a=frequency(arr,arr[min]);
				int b=frequency(arr,arr[j]);
				
				if(a>b)
				{
					min=j;
				}
				else if(min==i&&arr[min]<arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int frequency(int arr[],int num)
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
			
			
		}
		return count;
	}
	
//	Que 8. Sort the array based on the units digit of each
//	number in ascending order using Selection Sort.
//	Example:
//	Input: arr = [42, 31, 63, 74, 25]
//	Output: [31, 42, 63, 74, 25]
//	Explanation: Sorting is based on units digit: [1, 2, 3, 4,
//	5].
	public static void question8(int arr[])
	{
		System.out.println("Question8");
		for(int i=0; i<arr.length-1; i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[min]%10>arr[j]%10)
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 9. Sort the array in ascending order based on the
//	sum of the digits of each number using Selection Sort.
//	Example
//	Input: arr = [23, 45, 12, 56, 34]
//	Output: [12, 23, 34, 45, 56]
//	Explanation:
//	• Input Array: [23, 45, 12, 56, 34]
//	• Sum of digits of each element: [5, 9, 3, 11, 7]
//	• Sorted sums in ascending order: [3, 5, 7, 9, 11]
//	• Rearranged array based on sorted sums: [12, 23,
//	34, 45, 56]
	public static void question9(int arr[])
	{
		System.out.println("Question9");
		for(int i=0; i<arr.length-1; i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length; j++)
			{
				int minsum=sumOfDigits(arr[min]);
				int jsum=sumOfDigits(arr[j]);
				
				if(minsum>jsum)
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int sumOfDigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
			
		}
		return sum;
	}
	
//	Que 10. Sort the array in ascending order based on the
//	number of digits in each number. If multiple numbers
//	have the same number of digits, sort them in
//	ascending order.
//	Example
//	Input: arr = [123, 45, 6, 7890, 12]
//	Output: [6, 12, 45, 123, 7890]
//			Explanation:
//			• Number of digits: [3, 2, 1, 4, 2].
//			• Sorting first by the number of digits gives [1, 2, 2,
//			3, 4].
//			• For numbers with the same number of digits (like
//			12 and 45), they are sorted in ascending order.
//			• The final sorted array is: [6, 12, 45, 123, 7890].
	public static void question10(int arr[])
	{
		System.out.println("Question10");
		for(int i=0; i<arr.length-1; i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length; j++)
			{
				int a=count(arr[min]);
				int b=count(arr[j]);
				
				if(a>b)
				{
					min=j;
				}
				else if(min==i&&arr[min]>arr[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int count(int num)
	{
		int count=0;
		 while(num!=0)
		 {
			 num/=10;
			 count++;
		 }
		 return count;
	}


	
	public static void main(String[] args) 
	{
//		int arr[]= {4,7,3,1,8,6,2};
//		selectionSortincreasing(arr);
//		selectionSortdecreasing(arr);
		
		
//		Que1.
//		int arr[]= {45,12,89,23,5,67};
//		question1(arr);
		
		
//		Que2.
//		int arr[]= {10,50,1,29,32,12,43};
//		question2(arr);
		
		
//		Que3.
//		int arr[]= {7,10,4,3,20,15};
//		int k=3;
//		question3(arr,k);
		
		
//		Que4.
//		String names[]={"Alice","Bob","Charlie"};
//		int score[]= {50,80,70};
//		question4(names, score);
		
		
//		Que5.
//		int arr[]= {4,1,7,2,3,5};
//		question5(arr);
		
		
//		Que6.
//		int arr[]= {4,1,2,3};
//		question6(arr);
		
		
//		Que7.
//		int arr[]= {2,3,1,3,2};
//		question7(arr);
		
		
//		Que8.
//		int arr[]= {42,31,63,74,25};
//		question8(arr);
		
		
//		Que9.
//		int arr[]= {23,45,12,11,19,21,56,34};
//		question9(arr);
		
		
//		Que10.
//		int arr[]= {123,45,6,7890,12};
//		question10(arr);
	}
}
