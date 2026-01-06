package insertionSortAsignment;

import java.awt.CardLayout;
import java.awt.PrintJob;
import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Main 
{
	public static void insertionSortincreasing(int arr[])
	{
		for(int i=1; i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSortdecreasing(int arr[])
	{
		for(int i=1; i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 1. Write a program to sort the following array in
//	increasing order using the Insertion Sort algorithm.
//	Example
//	Input: arr = {12, 11, 13, 5, 6}
//	Output: Sorted array: {5, 6, 11, 12, 13}
//	Explanation: The Insertion Sort algorithm sorts the
//	array by repeatedly picking the next element from the
//	unsorted part of the array and inserting it into its
//	correct position within the sorted part.
	public static void question1(int arr[])
	{
		for(int i=1; i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 2. Write a program to sort the following array in
//	decreasing order using the Insertion Sort algorithm.
//	Example
//	Input: arr = {12, 11, 13, 5, 6}
//	Output: Sorted array: {13, 12, 11, 6, 5}
//	Explanation: The Insertion Sort algorithm sorts the
//	array by repeatedly picking the next element from the 
//	unsorted part of the array and inserting it into its
//	correct position in the sorted part, but for decreasing
//	order, the larger elements are placed first.
	public static void question2(int arr[])
	{
		for(int i=1; i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]<key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
	
//	Que 3. Write a program to implement the Insertion
//	Sort algorithm to sort an array of strings. The sorting
//	should be done based on the length of the strings in
//	ascending order. If two strings have the same length,
//	they should be sorted alphabetically.
//	Example
//	Input: String[] strings = {"banana", "apple", "pear",
//	"kiwi", "orange"};
//	Output: kiwi pear apple banana orange
//	Explanation:
//	1. The strings are first sorted by their length in
//	ascending order.
//	2. If two strings have the same length, they are
//	sorted alphabetically.
	public static void question3(String st[])
	{
		for(int i=1; i<st.length;i++)
		{
			String key=st[i];
			int j=i-1;
			while((j>=0&&st[j].length()>key.length()) || (j>=0&&st[j].length()==key.length()&&st[j].charAt(0)>key.charAt(0)))
			{
				st[j+1]=st[j];
				j--;
			}
			st[j+1]=key;
		}
		System.out.println(Arrays.toString(st));
	}

	
//	Que 4. Write a program to implement the Insertion
//	Sort algorithm for an array containing floating-point
//	numbers (double). The array should be sorted in
//	ascending order.
//	Example
//	Input: double[] arr = {2.56, 1.1, 3.141, 0.567, 2.0};
//	Output: 0.567 1.1 2.0 2.56 3.141
//	Explanation:
//	• The array {2.56, 1.1, 3.141, 0.567, 2.0} is sorted in
//	ascending order using insertion sort.
//	• The resulting array after sorting is {0.567, 1.1, 2.0,
//	2.56, 3.141}.
	public static void question4(double arr[])
	{
		for(int i=1; i<arr.length;i++)
		{
			double key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));	
	}
	
//	Que 5. Write a program to sort an array of strings
//	based on the number of vowels in each string using
//	insertion sort. If two strings have the same number of
//	vowels, sort them alphabetically.
//	Example
//	Input: Words: ["apple", "banana", "grape", "kiwi"]
//			Output: Sorted Words: ["apple", "kiwi", "grape",
//			"banana"]
//			Explanation:
//			1. "apple" has 2 vowels and comes before "kiwi" and
//			"grape" alphabetically.
//			2. "kiwi" and "grape" both have 2 vowels; "kiwi"
//			comes first alphabetically.
//			3. "banana" has 3 vowels, so it comes last.
	public static void question5(String st[])
	{
		for(int i=1; i<st.length;i++)
		{
			String key=st[i];
			int j=i-1;
			while((j>=0&&countVowels(st[j])>countVowels(key)) || j>=0&&countVowels(st[j])==countVowels(key)&&st[j].charAt(0)>key.charAt(0))
			{
				st[j+1]=st[j];
				j--;
			}
			st[j+1]=key;
		}
		System.out.println(Arrays.toString(st));
		
	}
	public static int countVowels(String st)
	{
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
//		int arr[]= {3,6,1,9,2,4};
//		insertionSortincreasing(arr);
//		insertionSortdecreasing(arr);
		
		
//		Que1.
//		int arr[]= {12,11,13,5,6};
//		question1(arr);
		
		
//		Que2.
//		int arr[]= {12,11,13,5,6};
//		question2(arr);
		
		
//		Que3.
//		String st[]= {"banana","abcdeg", "pear", "kiwi","ciku","apple","orange"};
//		question3(st);
		
		
//		Que4.
//		double arr[]= {2.56,1.1,3.141,0.567,2.0};
//		question4(arr);
		
		
//		Que5.
		String st[]= {"apple","banana","kiwi","grape"};
		question5(st);
		
		
	}

}
