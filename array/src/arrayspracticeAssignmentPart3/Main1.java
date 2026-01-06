package arrayspracticeAssignmentPart3;

import java.util.*;

public class Main1 
{
//	Que 1. Given an array of integers, find the pair of
//	elements whose product is maximum and the pair
//	whose product is minimum. Return their respective
//	products and the pairs.
//	Example
//	Input: nums = [1, -10, 20, -30, 5]
//	Output: Maximum Product: 300 (Pair: [-10, -30])
//	Minimum Product: 600 (Pair: [20, -30])
//	Explanation:
//	For the maximum product, the pair [-10, -30] gives the
//	product 300, which is the highest among all pairs.
//	For the minimum product, the pair [20, -30] gives the
//	product −600, which is the lowest among all pairs.
	public static void question1(int arr[])
	{
		System.out.print("Maximum Product: ");
		System.out.println(" (Pair:"+Arrays.toString(maximumProduct(arr))+")");
		System.out.print("Minimum Product: ");
		System.out.println(" (Pair:"+Arrays.toString(minimumProduct(arr))+")");
		
	}
	public static int[] maximumProduct(int arr[])
	{
		int newpair[]=new int[2];
		int product=0;
		for(int i=0; i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					continue;
				}
				count=arr[i]*arr[j];
				if(product<count)
				{
					product=count;
					newpair[0]=arr[i];
					newpair[1]=arr[j];
				}
			}	
		}
		System.out.print(product);
		return newpair;
	}
	public static int[] minimumProduct(int arr[])
	{
		int newpair[]=new int[2];
		int product=0;
		for(int i=0; i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					continue;
				}
				count=arr[i]*arr[j];
				if(product>count)
				{
					product=count;
					newpair[0]=arr[i];
					newpair[1]=arr[j];
				}
			}	
		}
		System.out.print(product);
		return newpair;
    }
	
	public static void main(String[] args) 
	{
		int arr[]= {1,-10,20,-30,5};
		question1(arr);
	}

}
