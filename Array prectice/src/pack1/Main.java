package pack1;
import java.util.*;
public class Main 
{
	public static void q14(int arr1[])
	{
		int newarr[]=new int[arr1.length];
		//System.out.println("Q14");
		int i=0;
		int k=arr1.length-1;
		int j=0;
		while(j<arr1.length)
		{
			if(arr1[j]>0)
			{
				newarr[i]=arr1[j];
				i++;
				j++;
			}
			else
			{
				newarr[k]=arr1[i];
				i++;
				j++;
				k--;
			}
		}
		System.out.println(Arrays.toString(newarr));
		
	}
	
	public static void q2(int arr[])
	{
		int newarr[]=new int[arr.length];
		int j=0;
		int k=arr.length-1;
		for(int i=0; i< arr.length;i++)
		{
			if(arr[i]>0)
			{
				newarr[i]=arr[i];
				j++;
			}
			else 
			{
				newarr[k]=arr[i];
				j++;
				k--;
			}
		}
		
		System.out.println(Arrays.toString(newarr));
	}
    public static void main(String[] args) 
    {
//    	int arr1[]= {4,3,-1,-2,6,-9,8};
//    	q14(arr1);
    	int arr2[]= {4,3,-1,-2,6};
    	q2(arr2);
    }
}

