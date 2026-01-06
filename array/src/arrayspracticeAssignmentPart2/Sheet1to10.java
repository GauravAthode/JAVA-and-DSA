package arrayspracticeAssignmentPart2;
import java.security.PublicKey;
import java.util.*;
import java.util.concurrent.CountDownLatch;
public class Sheet1to10 
{
//	Que 1. Write a program to swap two elements of an
//	array at given indices i and j.
//	Example
//	Input: arr = [10, 20, 30, 40, 50], i = 1, j = 3
//	Output: Array after swapping: [10, 40, 30, 20, 50]
//	Explanation: The elements at indices 1 and 3 (20 and
//	40) are swapped, resulting in the new array [10, 40, 30,
//	20, 50]
	public static void question1(int arr[],int i,int j)
	{
		System.out.println("Question1");
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		for(int k=0;k<arr.length;k++ )
		{
			System.out.print(arr[k]+" ");
		}
	}
	
	
//	Que 2. Write a Java program to reverse an array
//	using the swapping technique.
//	Example
//	Input: arr = {10, 20, 30, 40, 50}
//	Output: 50 40 30 20 10
//	Explanation: Swap the first and last elements,
//	moving inward until the middle, to reverse the
//	array
	public static void question2(int arr[])
	{
		System.out.println("Question2");
		System.out.println("Before swapping");
		System.out.println(Arrays.toString(arr));
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println("After swapping");
		System.out.println(Arrays.toString(arr));
	}
	
	
//	Que 3. Write a Java program to swap the portion of
//	the array after the given index k. The portion of the
//	array starting from index k+1 to the end should be
//	reversed.
//	Example
//	Input: arr = {1, 2, 3, 8, 7, 5, 4} Index (k): 2
//	Output: 1 2 3 4 5 7 8
	public static void question3(int arr[],int k)
	{
		System.out.println("Question3");
		System.out.println("Before swap");
		System.out.println(Arrays.toString(arr));
		int i=k+1;
		int j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println("After swap");
		System.out.println(Arrays.toString(arr));	
	}
	
//	Que 4. Write a program to return the second
//			largest element from the array. If the second largest
//			element doesn't exist then return -1.
//			Note: The second largest element should not be equal
//			to the largest element.
//			Example
//			Input: arr[] = [12, 35, 1, 10, 34, 1]
//			Output: 34
//			Explanation: The largest element of the array is 35 and
//			the second largest element is 34.
//			Input: arr[] = [10, 5, 10]
//			Output: 5
//			Explanation: The largest element of the array is 10 and
//			the second largest element is 5.
//			Input: arr[] = [10, 10, 10]
//			Output: -1
//			Explanation: The largest element of the array is 10 and
//			the second largest element does not exist.
	public static int question4(int arr[])
	{
		System.out.println("Question4");
		System.out.println("second largest element in array");
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}	
			}
		}
		for(int i=0; i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				return arr[i+1];
			}
		}
		return -1;
	}
	
//	Que 5. Write a program to return the second smallest
//			element from the array. If the second smallest element
//			doesn't exist, return -1.
//			Note: The second smallest element should not be
//			equal to the smallest element.
//			Example
//			Input: arr[] = [12, 35, 1, 10, 34, 1]
//			Output: 10
//			Explanation: The smallest element in the array is 1,
//			and the second smallest element is 10.
//			Input: arr[] = [10, 5, 10]
//			Output: 10
//			Explanation: The smallest element in the array is 5, and
//			the second smallest element is 10.
//			Input: arr[] = [10, 10, 10]
//			Output: -1
//			Explanation: All elements are the same, so no second
//			smallest element exists.		
	public static int question5(int arr[])
	{
		System.out.println("Question5");
		System.out.println("Second smallest element in array");
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0; i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				return arr[i+1];
			}
		}
		return -1;
	}
	
	
//	Que 6. Write a program to return the kth largest
//			element from an array. If the array has less than k
//			distinct elements, return -1.
//			Example
//			Input: arr[] = [3, 2, 1, 5, 6, 4], k = 4
//			Output: 3
//			Explanation: The distinct elements of the array are [6, 5,
//			4, 3, 2, 1] in sorted order. The 4th largest element is 3.
//			Input: arr[] = [10, 10, 20, 20], k = 3
//			Output: -1
//			Explanation: The distinct elements of the array are [10,
//			20]. There are less than 3 distinct elements, so the
//			output is -1.
	public static int question6(int arr[],int k)
	{
		System.out.println("Question6");
		System.out.println(k+"th largest of array");
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
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
	
//	Que 7. Write a program to return the kth smallest
//			element from an array. If the array has less than k
//			distinct elements, return -1.
//			Example
//			Input: arr[] = [3, 3, 2, 1, 4, 4], k = 3
//			Output: 3
//			Explanation: The distinct elements of the array are [1, 2,
//			3, 4] in sorted order. The 3rd smallest element is 3.
//			Input: arr[] = [8, 8, 8, 8], k = 2
//			Output: -1
//			Explanation: All elements in the array are the same (8).
//			Therefore, there is no 2nd smallest distinct element, as
//			only one distinct element (8) exists.
	public static int question7(int arr[],int k)
	{
		System.out.println("Question7");
		System.out.println(k+"th smallest of array");
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
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
	
	
	
	
//	Que 8. Write a program to check if an array of integers
//	is sorted in non-decreasing order. If the array is sorted,
//	print true; otherwise, print false.
//	Example
//	Input: arr[] = [1, 2, 3, 4, 5]
//	Output: true
//	Explanation: The array is sorted in non-decreasing
//	order.
//	Input: arr[] = [5, 4, 3, 2, 1]
//			Output: false
//			Explanation: The array is sorted in decreasing order,
//			not non-decreasing order.
//			Input: arr[] = [10, 20, 20, 30]
//			Output: true
//			Explanation: The array contains equal elements but is
//			sorted in non-decreasing order.
//			Input: arr[] = [1, 3, 2, 4, 5]
//			Output: false
//			Explanation: The array is not sorted due to the
//			unordered pair (3, 2).
	public static boolean question8(int arr[])
	{
		int i=0;
		int j=i+1;
		while(arr[i]<arr.length-1)
		{
			if(arr[i]<arr[j])
			{
				i++;
				j++;
			}
			else
			{
				return false;
			}
		}
		return true;
		
	}
	
//	Que 9. Write a program to count the number of unique
//	elements in an array of integers, including duplicates.
//	Example:
//	Input: arr[] = [10, 20, 20, 30, 40, 40, 40]
//	Output: 4
//	Explanation: Unique elements are 10, 20, 30, 40.
//	Input: arr[] = [1, 1, 1, 1]
//	Output: 1
//	Explanation: Unique element is 1.
	public static void question9(int arr[])
	{
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
				
			}
		}
		int count =1;
		int i=0;
		while(i<arr.length-1)
		{
			int j=i+1;
			if(arr[i]!=arr[j])
			{
				i++;
				count++;	
			}
			else 
			{
				i++;
				
			}
		}
		System.out.println(count);
	}
	
//	Que 10. Write a program to remove duplicates from an
//	array and print the new array containing only unique
//	elements.
//	Example:
//	Input: arr[] = [10, 20, 20, 30, 40, 40, 40]
//	Output: [10, 20, 30, 40]
//	Explanation: Duplicate elements 20 and 40 are
//	removed.
//	Input: arr[] = [1, 1, 1, 1]
//	Output: [1]
//	Explanation: Only the unique element 1 remains
	public static void question10(int arr[])
	{
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
		}
		
		int count =1;
		int i=0;
		while(i<arr.length-1)
		{
			int j=i+1;
			if(arr[i]!=arr[j])
			{
				i++;
				count++;	
			}
			else 
			{
				i++;
				
			}
		}
		int newarr[]=new int[count];
		int j=0;
		int index=0;
		newarr[index]=arr[j];
		while(j<arr.length-1)
		{
			int k=j+1;
			
			if(arr[j]!=arr[k])
			{
				index++;
				newarr[index]=arr[k];
				j++;
			}
			else 
			{
				j++;
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
	
	public static void main(String[] args) 
	{
		
//		Que1.
//		int arr[]= {10,20,30,40,50};
//		int i=1;
//		int j=3;
		//question1(arr,i,j);
		
		
//		Que2.
//		int arr[]= {10,20,30,40,50};
		//question2(arr);
		
		
//		Que3.
//		int arr[]= {1,2,3,8,7,5,4};
//		int index=2;
		//question3(arr,index);
		
		
//		Que4.
//		int arr[] ={12,35,1,10,34,1};
//		System.out.println(question4(arr));
		
		
//		Que5.
//		int arr[] ={12,35,1,10,34,1};
//		System.out.println(question5(arr));
		
		
//		Que6.
		int arr[] = {2,3,4,5,6,6,6,6,1};
		int k = 4;
		System.out.println(question6(arr, k));
		
		
//		Que7.
//		int arr[] = {8,8,8,8};
//		int k = 2;
//		System.out.println(question7(arr, k));
//		
		
//		Que8.
//		int arr[]= {10,20,25,30};
//		System.out.println(question8(arr));
		
		
//		Que9.
//		int arr[]= {1,1,1,1,1,1};
//		question9(arr);
		
		
//		Que10.
//		int arr[]= {13,10,1,10,1,81};
//		question10(arr);
	
	}

}
