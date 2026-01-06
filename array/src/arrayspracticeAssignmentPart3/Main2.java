package arrayspracticeAssignmentPart3;

import java.util.*;

public class Main2 
{
//	Que 2. Given an integer array nums, return all the
//		triplets [nums[i], nums[j], nums[k]] such that i != j, i !=
//		k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//		Notice that the solution set must not contain duplicate
//		triplets.
//		Example
//		Input: nums = [-1, 0, 1, 2, -1, -4]
//		Output: [[-1,-1,2],[-1,0,1]]
//		Explanation:
//		nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//		nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//		nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//		The distinct triplets are [-1,0,1] and [-1,-1,2].
//		Notice that the order of the output and the order of
//		the triplets does not matter.
//		Input: nums = [0,1,1]
//		Output: []
//		Explanation: The only possible triplet does not sum up
//		to 0.
//		Input: nums = [0,0,0]
//		Output: [[0,0,0]]
//		Explanation: The only possible triplet sums up to 0.
	public static void question2(int arr[])
	{
		int triplarr[]=new int[3];
		int count=1;
		int index=0;
		for(int i=0; i<arr.length-2;i++)
		{
			for(int j=i+1; j<arr.length-1;j++)
			{
				int add=0;
				for(int k=j+1;k<arr.length;k++)
				{
					add=arr[i]+arr[j]+arr[k];
					if(add==0&&arr[i]!=arr[j]&&arr[i]!=arr[k]&&arr[j]!=arr[k])
					{
						triplarr[0]=arr[i];
						triplarr[1]=arr[j];
						triplarr[2]=arr[k];
						count++;
						int newarr[]=new int[count];
						System.out.print(Arrays.toString(triplarr));
					}
					else if(add==0&&arr[i]==0&&arr[j]==0&&arr[k]==0)
					{
						triplarr[0]=arr[i];
						triplarr[1]=arr[j];
						triplarr[2]=arr[k];
						count++;
						System.out.println(Arrays.toString(triplarr));
					}
				}
			}
		}
		if(count==1)
		{
			System.out.println("[]");
		}
		

	}



	public static void main(String[] args) 
	{
		int arr[]= {-1,0,1,2,-1,-4};
		question2(arr);
	}

}
