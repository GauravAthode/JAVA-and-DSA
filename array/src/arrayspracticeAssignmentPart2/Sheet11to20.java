package arrayspracticeAssignmentPart2;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Sheet11to20 
{
//	Que 11. Write a program to rotate an array to the right
//	by 1 position. The last element of the array should
//	become the first, and all other elements should shift
//	one position to the right.
//	Example:
//	Input: arr[] = [1, 2, 3, 4, 5]
//	Output: [5, 1, 2, 3, 4]
//	Explanation: The last element 5 becomes the first, and
//	the rest shift to the right.
//	Input: arr[] = [10, 20, 30, 40]
//	Output: [40, 10, 20, 30]
//	Explanation: The last element 40 becomes the first,
//	and others move right.
//	Input: arr[] = [7]
//	Output: [7]
//	Explanation: A single-element array remains the same
//	after rotation.
	public static int[] question11(int arr[],int i,int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	
	
//	Que 12. Write a program to rotate an array to the left
//	by 1 position. The first element of the array should
//	move to the last, and all other elements should shift
//	one position to the left.
//	Example:
//	Input: arr[] = [1, 2, 3, 4, 5]
//	Output: [2, 3, 4, 5, 1]
//	Explanation: The first element 1 moves to the end, and
//	the rest shift to the left.
//	Input: arr[] = [10, 20, 30, 40]
//	Output: [20, 30, 40, 10]
//	Explanation: The first element 10 moves to the end,
//	and others move left.
//	Input: arr[] = [7]
//	Output: [7]
//	Explanation: A single-element array remains the same
//	after rotation.
	public static int[] question12(int arr[],int i,int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
		
	}
	
	
	
//	Que 13. Write a program to rotate an array by k
//	positions. Each element in the array should be shifted
//	to the left k times, and the first k elements should
//	move to the end of the array.
//	Example:
//	Input: arr[] = [1, 2, 3, 4, 5], k = 2
//	Output: [3, 4, 5, 1, 2]
//	Explanation: The first two elements [1, 2] move to the
//	end.
//	Input: arr[] = [10, 20, 30, 40, 50, 60], k = 4
//	Output: [50, 60, 10, 20, 30, 40]
//	Explanation: The first four elements [10, 20, 30, 40]
//	move to the end.
	public static int[] question13(int arr[],int i,int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	
//	Que 14. Given an integer array nums, move all 0s to
//	the end of the array while maintaining the relative
//	order of the non-zero elements. You must solve this
//	problem in- place, without using extra space for
//	another array.
//	Example:
//	Input: nums = [0, 1, 0, 3, 12]
//	Output: [1, 3, 12, 0, 0]
//	Explanation: The 0s are moved to the end of the array
//	while the relative order of the non-zero elements
//	remains the same.
	public static void question14(int arr[])
	{
		int i=0;
		int j=0;
		while(j<arr.length)
		{
			if(arr[j]!=0)
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
				j++;
			}
			else
			{
				j++;
				continue;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
//	Que 15. Write a program that takes two arrays as input
//	and merges them into a single array.
//	The program should return the new merged array
//	containing all elements from the first array followed by
//	all elements from the second array.
//	Example
//	Input: arr1 = [10, 20, 30] arr2 = [40, 50, 60]
//	Output: Merged Array: [10, 20, 30, 40, 50, 60]
//	Explanation: First, add all elements from Array 1, then
//	add all elements from Array 2 to the new array.
//	The resulting array [10, 20, 30, 40, 50, 60] is returned as
//	the output
	public static int[] questio15(int arr1[],int arr2[])
	{
		System.out.println("Question15");
		System.out.println("arr1 "+Arrays.toString(arr1));
		System.out.println("arr2 "+Arrays.toString(arr2));
		int size=arr1.length+arr2.length;
		int newarr[]=new int[size];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				newarr[k]=arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				newarr[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length)
		{
			newarr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length)
		{
			newarr[k]=arr2[j];
			j++;
			k++;
		}
		return newarr;
	}
	
	
//	Que 16. Given two sorted arrays a[] and b[], where each
//	array may contain duplicate elements, the task is to
//	return the array of elements in the union of the two
//	arrays in sorted order. The union should only contain
//	distinct elements, even if an element appears multiple
//	times in the arrays.
//	Example:
//		Input:
//		a[] = [1, 2, 3, 4, 5]
//		b[] = [2, 4, 6, 8]
//		Output:
//		[1, 2, 3, 4, 5, 6, 8]
//		Explanation: The union of the two arrays is [1, 2, 3, 4,
//		5, 6, 8], as it includes only distinct elements.
//		Input:
//		a[] = [1, 2, 2, 4, 5]
//		b[] = [2, 4, 5, 5, 6]
//		Output:
//		[1, 2, 4, 5, 6]
//		Explanation: The union of the two arrays is [1, 2, 4, 5,
//		6], with duplicates removed.
	public static void question16(int arr1[],int arr2[])
	{
		System.out.println("Question16");
		System.out.println("arr1 "+Arrays.toString(arr1));
		System.out.println("arr2 "+Arrays.toString(arr2));
		int size=arr1.length+arr2.length;
		int mergearr[]=new int[size];
		for(int i=0; i<arr1.length;i++)
		{
			mergearr[i]=arr1[i];
		}
		for(int i=0; i<arr2.length;i++)
		{
			mergearr[arr1.length+i]=arr2[i];
		}
		for(int i=0;i<mergearr.length-1;i++)
		{
			for(int j=i+1;j<mergearr.length-1;j++)
			{
				if(mergearr[i]>mergearr[j])
				{
					int temp=mergearr[j];
					mergearr[j]=mergearr[i];
					mergearr[i]=temp;
				}
			}
		}
		int count=1;
		int i=0;
		int j=i+1;
		while(j<mergearr.length)
		{
			if(mergearr[i]!=mergearr[j])
			{
				count++;
				i++;
				j++;
			}
			else 
			{
				i++;
				j++;
			}
		}
		int newarr[]= new int[count];
		int p=0;
		int q=p+1;
		int index=1;
		newarr[0]=mergearr[p];
		while(q<mergearr.length)
		{
			if(mergearr[p]!=mergearr[q])
			{
				newarr[index]=mergearr[q];
				index++;
				p++;
				q++;
			}
			else 
			{
				p++;
				q++;
			}
		}
		System.out.print("union of array : ");
		System.out.println(Arrays.toString(newarr));
		
	}
	
//	Que 17. Given an array nums[] containing n distinct
//	numbers in the range [0, n], return the only number in
//	the range that is missing from the array.
//	The array contains all numbers from 0 to n except one.
//	Your task is to find the missing number efficiently.
//	Example:
//	Input: nums = [1, 2, 4, 5, 0]
//	Output: 3
//	Explanation: The number 3 is missing from the array,
//	as all other numbers from 0 to 5 are present.
//	Input: nums = [0, 2]
//	Output: 1
//	Explanation: The number 1 is missing from the array.
//	Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
//	Output: 8
//	Explanation: The number 8 is missing from the array.
	public static void question17(int arr[])
	{
		System.out.println("Question17");
		System.out.println("array : "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.print("missing number : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i)
			{
				System.out.println(i);
				break;
			}
		}
	}
	
//	Que 18. Given a binary array nums, return the
//			maximum number of consecutive 0's in the array.
//			Example
//			Input:
//			nums = [0, 0, 1, 0, 0, 0]
//			Output: 3
//			Explanation: The last three digits are consecutive 0's.
//			The maximum number of consecutive 0's is 3
//			Input: nums = [1, 0, 0, 1, 0, 1]
//			Output: 2
//			Explanation: The two digits(index 1 and 2) are
//			consecutive 0's. The maximum number of consecutive
//			0's is 2.
	public static void question18(int arr[])
	{
		int count=0;
		int num=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
			else
			{
				if(num<count)
				{
					num=count;
				}
				count=0;
			}
		}
		if(num<count)
		{
			num=count;
		}
		System.out.println(num);
		
	}
	
//	Que 19. You are given array of integers, nums, where
//	every element appears twice except for one. Your task
//	is to return the element that appears only once.
//	Example
//	Input: nums = [4, 1, 2, 1, 2]
//	Output: 4
//	Explanation: The number 4 appears only once, while 1
//	and 2 each appear twice.
	public static int question19(int arr[])
	{
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				return arr[i];
			}
		}
		return 0;
		
	}
	
//	Que 20. Given an array arr. Find the majority element
//	in the array. If no majority exists, return -1. A majority
//	element in an array is an element that
//	appears strictly more than arr.size() / 2 times in the
//	array.
//	Example
//	Input : arr[] = [1, 1, 2, 1, 3, 5, 1]
//	Output : 1
//	Explanation: Note that 1 appear 4 times which is more
//	than 7 / 2 times
//	Input : arr[] = [3, 3, 4, 2, 4, 4, 2, 4]
//	Output : -1
//	Explanation: There is no element whose frequency is
//	greater than the half of the size of the array size.
//	Input : arr[] = [3]
//	Output : 3
//	Explanation: Appears more than n/2 times
	public static int question20(int arr[])
	{
		int n=arr.length/2;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int num=0;
		int out=0;
		for(int i=0; i<arr.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(num<count)
			{
				num=count;
				out=arr[i];
			}
		}
		if(arr.length==1)
		{
			return arr[0];
		}
		if(num>n)
		{
			return out;
		}
		return -1;	
	}
	

	public static void main(String[] args) 
	{
//		Que11
//		int arr[]= {1,2,3,4,5}; 
//		System.out.println("Before right rotate");
//		System.out.println(Arrays.toString(arr));
//		int start=0;
//		int end=arr.length-1;
//		int q=arr.length-1;
//		int p=q-1;
//		question11(arr,start, p);
//		question11(arr, q,end);
//	    question11(arr, start, end);
//	    System.out.println("After rotate");
//	    System.out.println(Arrays.toString(arr));
		
		
//		Que12
//		int arr[]= {1,2,3,4,5};
//		System.out.println("Before right rotate");
//		System.out.println(Arrays.toString(arr));
//		int start=0;
//		int end=arr.length-1;
//		int q=1-1;
//		int p=q+1;
//		question12(arr, start,q);
//		question12(arr, p, end);
//		question12(arr, start,end);
//		System.out.println("After rotate");
//	    System.out.println(Arrays.toString(arr));
		
		
//		Que13.
//		int arr[]= {1,2,3,4,5};
//		int start=0;
//		int end=arr.length-1;
//		int k=2;
//		int p=k-1;
//		int q=p+1; 
//		question13(arr, start, p); 
//		question13(arr,q,end); 
//		question13(arr, start,end);
//		System.out.println(Arrays.toString(arr));
		
		
//		Que14.
//		int arr[]= {0,1,0,3,12};
//		question14(arr);
		
		
//		Que15.
//		int arr1[]= {10,20,30};
//		int arr2[]= {40,50,60};
//		System.out.println(Arrays.toString(questio15(arr1, arr2)));
		
		
//		Que16.
//		int arr1[]= {1,2,3,4,5};
//		int arr2[]= {2,4,6,8};
//		question16(arr1, arr2);
		
		
//		Que17.
//		int arr[]= {9,6,4,2,3,5,7,0,1};
//		question17(arr);
		
//		Que18.
//		int arr[]= {0,0,1,0,0,0,1};
//		question18(arr);
		
//		Que19.
//		int arr[]= {4,1,2,1,2};
//		System.out.println(question19(arr));
		
//		Que20.
//		int arr[]= {1,1,2,1,3,5,1};
//		System.out.println(question20(arr));		
	}
}
