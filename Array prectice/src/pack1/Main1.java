package pack1;
import java.util.*;
public class Main1 
{
	public static void question13()
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0 ; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<size; i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		int arr1[]=new int[count];
		 int index=0;
		for(int i=0; i<size;i++)
		{
			if(arr[i]%2==0)
			{
				arr1[index]=arr[i];
				index++;
			}
		}
		for(int i=0; i<count;i++)
		{
			System.out.println(arr1[i]);
		}
		
	}
	public static void main(String[] args) 
	{
		question13();

	}

}
