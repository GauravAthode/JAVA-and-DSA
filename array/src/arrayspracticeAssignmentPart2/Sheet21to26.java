package arrayspracticeAssignmentPart2;

import java.util.*;

public class Sheet21to26 
{
	
//	Que 21. Write a program to swap the contents of two
//	arrays of the same length. After the swap, the contents
//	of the first array should become those of the second
//	array and vice versa.
//	Example
//	Input: arr1 = [1, 2, 3], arr2 = [4, 5, 6]
//	Output: After swapping:
//	arr1 = [4, 5, 6], arr2 = [1, 2, 3]
//	Explanation: The contents of array1[] become those of
//	array2[], and the contents of array2[] become those of
//	array1[].
	public static void question21(int arr1[],int arr2[])
	{
		int temp[]=arr1;
		arr1=arr2;
		arr2=temp;
		System.out.println("After swaping");
		System.out.println("arr1 = "+Arrays.toString(arr1));
		System.out.println("arr2 = "+Arrays.toString(arr2));
	}
	
//	Que 22. Write a program to find the peak element in
//	an unsorted array.
//	Note:
//	• An element is a peak if it is greater than or equal
//	to its neighbours.
//	• For the first element, it is a peak if it is greater
//	than or equal to the second element.
//	• For the last element, it is a peak if it is greater than
//	or equal to the second-to-last element.
//	• For other elements, it is a peak if it is greater than
//	or equal to both its neighbours.
//	If there are multiple peak elements, return any one of
//	them.
//	Example
//	Input: arr[]= {5, 10, 20, 15}
//	Output: 20
//	Explanation: The element 20 has neighbours 10 and
//	15, both of them are less than 20.
//	Input: arr[] = {10, 20, 15, 2, 23, 90, 90}
//	Output: 20 or 90
//	Explanation: The element 20 has neighbours 10 and
//	15, both of them are less than 20, similarly 90 has
//	neighbours 23 and 67.
	public static void question22(int arr[])
	{
		int n=arr.length;
		if(arr[0]>=arr[1]||n==1)
		{
			System.out.print(arr[0]+" ");
		}
		for(int i=1; i<arr.length-1; i++)
		{
			if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		if(arr[n-1]>=arr[n-2])
		{
			System.out.print(arr[n-1]);
		}
		
	}
		
//	Que 23. Given an array arr[] of size n, the task is to find
//	all the Leaders in the array. An element is a Leader if it
//	is greater than all the elements to its right side.
//	Note: The rightmost element is always a leader.
//	Example
//	Input: arr[] = [16, 17, 4, 3, 5, 2]
//	Output: [17 5 2]
//	Explanation: 17 is greater than all the elements to its
//	right i.e., [4, 3, 5, 2], therefore 17 is a leader. 5 is
//	greater than all the elements to its right i.e., [2],
//	therefore 5 is a leader. 2 has no element to its right,
//	therefore 2 is a leader.
//	Input: arr[] = [1, 2, 3, 4, 5, 2]
//	Output: [5 2]
//	Explanation: 5 is greater than all the elements to its
//	right i.e., [2], therefore 5 is a leader. 2 has no element
//	to its right, therefore 2 is a leader.
	public static void question23(int arr[])
	{
		int count=1;
		for(int i=0;i<arr.length-1;i++)
		{
			int num=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{}
				else 
				{
					num++;
				}
			}
			
			if(num==0)
			{
				count++;
			}
		}
		int newarr[]=new int[count];
		int index=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int num=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{}
				else 
				{
					num++;
				}
			}
			if(num==0)
			{
				newarr[index]=arr[i];	
				index++;
			}
		}
		newarr[count-1]=arr[arr.length-1];
		System.out.println(Arrays.toString(newarr));
	}
	
//	Que 24. Given an array of integers nums and an integer
//	target, return the indices of the two numbers such that
//	they add up to the target.
//	You may assume that each input would have exactly
//	one solution, and you may not use the same element
//	twice.
//	You can return the answer in any order.
//	Example
//	Input: nums = [2,7,11,15], target = 9
//	Output: [0,1]
//	Explanation: Because nums[0] + nums[1] == 9, we
//	return [0, 1].
//	Input: nums = [3,2,4], target = 6
//	Output: [1,2]
//	Explanation: Because nums[1] + nums[2] == 6, we
//	return [1, 2].
//	Input: nums = [3,3], target = 6
//	Output: [0,1]
//	Explanation: Because nums[0] + nums[1] == 6, we
//	return [0, 1].
	public static int[] question24(int arr[],int target)
	{
		int arrindex[]=new int[2];
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					arrindex[0]=i;
					arrindex[1]=j;
					return arrindex;
				}
			}
		}
		return arrindex;
	}
	
//	Que 25. Given an array arr[] containing integers and an
//	integer k, your task is to find the length of the longest
//	subarray where the sum of its elements is equal to the
//	given value k. It is guaranteed that a valid subarray
//	exists.
//	Example
//	Input: arr[] = [10, 5, 2, 7, 1, 9], k = 15
//	Output: 4
//	Explanation: The subarray [5, 2, 7, 1] has a sum of 15
//	and length 4.
//	Input: arr[] = [-1, 2, -3], k = -2
//	Output: 3
//	Explanation: The subarray [-1, 2, -3] has a sum of -2
//	and length 3.
//	Input: arr[] = [1, -1, 5, -2, 3], k = 3
//	Output: 4
//	Explanation: The subarray [1, -1, 5, -2] has a sum of 3
//	and a length 4.
	public static void question25(int arr[],int k)
	{
		int add=0;
		int count=0;
		for(int i=0; i<arr.length-1;i++)
		{
			int sum=0;
			sum=arr[i];
			for(int j=i+1; j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum==k)
				{
					count=j-i+1;
					if(add<=count)
					{
						add=count;
					}
				}
			}
		}
		System.out.println(add);
	}
	
//	Que 26. Given an array of integers of size N, the task is
//	to find the first non-repeating element in this array.
//	Example
//	Input: [-1, 2, -1, 3, 0]
//	Output: 2
//	Explanation: The first number that does not repeat is:
//	2
//	Input: [9, 4, 9, 6, 7, 4]
//	Output: 6
//	Explanation: The first number that does not repeat is: 6
	public static void question26(int arr[])
	{
		for(int i=0; i<arr.length;i++)
		{
			int count=0;
			for(int j=0; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					if(count==2)
					{
						break;
					}
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
//		Que21.
//		int arr1[]= {1,2,3};
//		int arr2[]= {4,5,6};
//		question21(arr1,arr2);
		
		
//		Que22.***
//		int arr[]= {10,20,15,2,23,90,90};
//		question22(arr);
		
		
//		Que23.
//		int arr[]= {1,2,3,4,5,2};
//		question23(arr);
		
		
//		Que24.
//		int arr[]= {2,7,11,15};
//		int target=9;
//		System.out.println(Arrays.toString(question24(arr, target)));

		
//		Que25.
//		int arr[]= {1,-1,5,-2,3};
//		int k=3;
//		question25(arr, k);
		
		
//		Que26.
//		int arr[]= {9,4,9,6,7,4};
//		question26(arr);
		
	}
}
