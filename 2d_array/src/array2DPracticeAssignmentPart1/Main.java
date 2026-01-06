package array2DPracticeAssignmentPart1;

import java.sql.PseudoColumnUsage;
import java.util.*;
public class Main 
{
//	Que 1. Write a program to print all elements of a 2D
//	array. You need to declare and initialize a 2D array of
//	integers with predefined values. Use nested loops to
//	traverse through the array and print each element in a
//	matrix format (row by row).
//	Example
//	Input: int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//	Output: 1 2 3
//	 4 5 6
//	 7 8 9
//	Explanation: Each row of the 2D array is printed in one
//	line, with elements separated by spaces.
	public static void question1(int arr[][])
	{
		System.out.println("Question1");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
//	Que 2. Write a program to print the first and last row
//	of a 2D array.
//	Example
//	Input: int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//	Output: 1 2 3
//	 7 8 9
//	Explanation: The program prints the first row {1, 2, 3}
//	and the last row {7, 8, 9} from the 2D array.
	public static void question2(int arr[][])
	{
		System.out.println("Question2");
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				if(r==0||r==arr[r].length-1)
				{
					System.out.print(arr[r][c]+ " ");
					
				}	
			}
			System.out.println();
		}
	}
	
//	Que 3. Write a program to print first and last column of
//	an array.
//	Example
//	Input: int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//	Output: 1 3
//	 4 6
//	 7 9
//	Explanation: The program prints the first column {1, 4,
//	7} and the last column {3, 6, 9} from the 2D array.
	public static void question3(int arr[][])
	{
		System.out.println("Question3");
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				if(c==0||c==arr[r].length-1)
				{
					System.out.print(arr[r][c]+ " ");	
				}
			}
			System.out.println();
		}
		
	}
	
//	Que 4. Write a program to print only diagonal
//	elements of an array.
//	Example
//	Input: int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//	Output: 1 3
//	 5
//	 7 9
//	Explanation: The program prints elements from both
//	the main diagonal (where row == col) and the
//	secondary diagonal (where row + col == arr.length - 1),
//	while leaving all other positions blank.
	public static void question4(int arr[][])
	{
		System.out.println("Question4");
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				if(c==r||r+c==arr.length-1)
				{
					System.out.print(arr[r][c]+ " ");
					
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
//	Que 5. Write a program to print all elements below the
//	major Diagonal of an array.
//	Example
//	Input: int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//	Output: 4
//	 7 8
//	Explanation: The program prints all elements below
//	the major diagonal (where row > col) of a 2D array.
	public static void question5(int arr[][])
	{
		System.out.println("Question5");
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				if(r>c)
				{
					System.out.print(arr[r][c]+ " ");
					
				}
			}
			System.out.println();
		}
	}
	
//	Que 6. Write a program to print all elements above the
//	major Diagonal of an array.
//	Example
//	Input: int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//	Output: 2 3
//	 6
//	Explanation: The program prints all elements above
//	the major diagonal (where row < col) of a 2D array.
	public static void question6(int arr[][])
	{
		System.out.println("Question6");
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				if(r<c)
				{
					System.out.print(arr[r][c]+ " ");
					
				}
			}
			System.out.println();
		}	
	}
	
//	Que 7. Write a program to print all even elements of
//	an array.
//	Example
//	Input: int[][] arr = { {12, 5, 18},
//	 {7, 16, 23},
//	 {20, 30, 45} };
//	Output: 12 18 16 20 30
//	Explanation: The program iterates through a 2D array
//	with diverse values and prints all the even elements.
	public static void question7(int arr[][])
	{
		System.out.println("Question7");
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				if(arr[r][c]%2==0)
				{
					System.out.print(arr[r][c]+" ");
					
				}
			}
		}	
	}
	
//	Que 8. Write a program to multiply all elements of an
//	array by 10.
//	Example
//	Input: int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//	Output: 10 20 30
//	 40 50 60
//	 70 80 90
//	Explanation: The program multiplies each element of a
//	2D array by 10 and prints the updated array.
	public static void question8(int arr[][])
	{
		System.out.println("Question8");
		for(int r=0; r<arr.length;r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]*10+" ");
			}
			System.out.println();
		}
	}
	
//	Que 9. Write a program to replace all negative
//	elements of an array by 0 (zero).
//	Example
//	Input: int[][] arr = { {5, -2, 3},
//	 {-4, 7, -1},
//	 {8, -9, 10}};
//	Output: 5 0 3
//	 0 7 0
//	8 0 10
//	Explanation: The program checks each element of the
//	2D array, and if it is negative, it replaces it with 0.
	public static void question9(int arr[][])
	{
		System.out.println("Question9");
		for(int r=0; r<arr.length;r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				if(arr[r][c]<0)
				{
					arr[r][c]=0;
					System.out.print(arr[r][c]+" ");
				}
				else
				{
					System.out.print(arr[r][c]+ " ");
				}
			}
			System.out.println();
		}
	}
	
//	Que 10. Write a program to swap first row with last
//	row.
//	Example
//	Input: int[][] arr = { {15, 25, 35},
//	 {40, 50, 60},
//	 {70, 80, 90} };
//	Output: 70 80 90
//	 40 50 60
//	 15 25 35
//	Explanation: The program swaps the first row and the
//	last row of a 2D array and prints the updated array.
	public static void question10(int arr[][])
	{
		for(int r=arr.length-1;r>=0;r--)
		{
			for(int c=0;c<arr[r].length; c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
	}
	
//	Que 11. Write a program to swap first column with last
//	column.
//	Example
//	Input: int[][] arr = { {15, 25, 35},
//	 {40, 50, 60},
//	 {70, 80, 90} };
//	Output: 35 25 15
//	 60 50 40
//	 90 80 70
//	Explanation: The program swaps the first column with
//	the last column of a 2D array and prints the updated
//	array
	public static void question11(int arr[][])
	{
		for(int r=0;r<arr.length;r++)
		{
			for(int c=arr[r].length-1;c>=0; c--)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
	}
	
//	Que 12. Write a program to sort each row of the array.
//	Example
//	Input: int[][] arr = { {12, 5, 8},
//	 {22, 11, 18},
//	 {9, 25, 16}};
//	Output: 5 8 12
//	 11 18 22
//	 9 16 25
//	Explanation: The program sorts each row of a 2D array
//	in ascending order and prints the updated array.
	public static void question12(int arr[][])
	{
		for(int r=0;r<arr.length;r++)
		{
			sort(arr[r]);
			
			for(int c=0;c<arr[r].length; c++)
			{
				System.out.print(arr[r][c]+" ");	
			}
			System.out.println();
		}
	}
	public static int[] sort(int arr[])
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
	
//	Que 13. Write a program to sort each column of the
//	array.
//	Example
//	Input: int[][] arr = { {12, 5, 8},
//	 {22, 11, 18},
//	 {9, 25, 16}};
//	Output: 9 5 8
//	 12 11 16
//	 22 25 18
//	Explanation: The program sorts each column of the 2D
//	array in ascending order.
	public static void question13(int arr[][])
	{
		for(int c=0;c<arr[0].length;c++)
		{
			int temp[]=new int[arr[0].length];
			for(int r=0; r<arr.length;r++)
			{
				temp[r]=arr[r][c];
			}
			sort1(temp);
			for(int r=0; r<arr.length;r++)
			{
				arr[r][c]=temp[r];
			}
		}
		for(int r=0; r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		
	}
	public static int[] sort1(int arr[])
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
	
//	Que 14. Write a program to find sum of diagonal
//	elements in an array.
//	Example
//	Input: int[][] arr = { {1, 2, 3},
//	 {4, 5, 6},
//	 {7, 8, 9} };
//	Output: 25
//	Explanation: The program calculates the sum of both
//	the main and secondary diagonal elements of a 2D
//	array.
	public static void question14(int arr[][])
	{
		int sum=0;
		for(int r=0; r<arr.length;r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				if(r==c || r+c==arr.length-1)
				{
					sum+=arr[r][c];
				}
			}
		}
		System.out.println(sum);
	}
	
	
//	Que 15. Write a program to find the sum of each row
//	in a 2D array and store the results in another array with
//	1 column containing the sum of each row.
//	Example
//	Input: int[][] arr = { {1, 2, 3},
//	 {4, 5, 6},
//	 {7, 8, 9} };
//	Output: [6]
//	 [15]
//	 [24]
//	Explanation: The program calculates the sum of each
//	row in a 2D array and stores these sums in a new 1-
//	column array.
	public static int[][] question15(int arr[][])
	{
		int newarr[][]=new int[arr.length][1];
		
		for(int r=0; r<arr.length;r++)
		{
			int rowSum=0;
			for(int c=0; c<arr[r].length;c++)
			{
				rowSum+=arr[r][c];
			}
			newarr[r][0]=rowSum;
		}
		return newarr;
	}
	
//	Que 16. Write a program to find sum of each Columns
//	in an array and store the results in another array with 1
//	column containing the sum of each column.
//	Example
//	Input: int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//	Output: [12]
//	 [15]
//	 [18]
//	Explanation: The program calculates the sum of each
//	column in a 2D array and stores the results in a
//	separate array.
	public static int[][] question16(int arr[][])
	{
        int newarr[][]=new int[arr.length][1];
		for(int r=0; r<arr.length;r++)
		{
			int addCol=0;
			for(int c=0; c<arr[r].length;c++)
			{
				addCol+=arr[c][r];
			}
			newarr[r][0]=addCol;	
		}
		return newarr;
	}
	
//	Que 17. Write a program to find the minimum element
//	in each row of a 2D array and print both the minimum
//	value along with its index (row and column).
//	Example
//	Input: int[][] arr = { {34, 12, 56},
//	 {87, 9, 14},
//	 {42, 73, 5}};
//	Output: Row 1: Min = 12, Index = (0, 1)
//	 Row 2: Min = 9, Index = (1, 1)
//	 Row 3: Min = 5, Index = (2, 2)
//	Explanation:
//	• Row 1: The minimum value is 12, located at index
//	(0, 1) — meaning it is in row 0 and column 1.
//	• Row 2: The minimum value is 9, located at index
//	(1, 1) — meaning it is in row 1 and column 1.
//	• Row 3: The minimum value is 5, located at index
//	(2, 2) — meaning it is in row 2 and column 2.
	public static void question17(int arr[][])
	{
		int count=0;
		for(int r=0; r<arr.length;r++)
		{
			int min=Integer.MAX_VALUE;
			int row=0;
			int column=0;
			
			for(int c=0; c<arr[r].length;c++)
			{
				if(arr[r][c]<min)
				{
					min=arr[r][c];
					row=r;
					column=c;
				}
			}
			count++;
			System.out.println("Row "+count+": "+"Min="+min+" , Index = ("+row+","+column+")");
		}
	}
	
//	Que 18. Write a program to find the maximum
//	element in each column of a 2D array and store its
//	value along with its index (row and column) in a new
//	array.
//	Example
//	Input: int[][] arr = { {34, 12, 56},
//	 {87, 9, 14},
//	 {42, 73, 5}};
//	Output: Column 1: Max = 87, Index = (1, 0)
//	 Column 2: Max = 73, Index = (2, 1)
//	 Column 3: Max = 56, Index = (0, 2)
//	Explanation:
//	• Column 1: The maximum value is 87, located at
//	index (1, 0) — meaning it is in row 1 and column 0.
//	• Column 2: The maximum value is 73, located at
//	index (2, 1) — meaning it is in row 2 and column 1.
//	• Column 3: The maximum value is 56, located at
//	index (0, 2) — meaning it is in row 0 and column 2.
	public static void question18(int arr[][])
	{
		int count=0;
		for(int c=0; c<arr[0].length;c++)
		{
			int max=Integer.MIN_VALUE;
			int row=0;
			int column=0;
			
			for(int r=0; r<arr.length;c++)
			{
				if(arr[r][c]>max)
				{
					max=arr[r][c];
					row=r;
					column=c;
				}
			}
			count++;
			System.out.println("Column "+count+": "+"Max="+max+" , Index = ("+row+","+column+")");
		}
	}
	
//	Que 19. Write a program to find the maximum
//	element and the minimum element of all elements in a
//	2D array.
//	Example
//	Input: int[][] arr = { {34, 12, 56},
//	 {87, 9, 14},
//	 {42, 73, 5}};
//	Output: Maximum element = 87
//	 Minimum element = 5
//	Explanation: The program finds the maximum and
//	minimum values from all the elements in a 2D array
//	and prints them.
	public static void question19(int arr[][])
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int r=0; r<arr.length;r++)
		{	
			for(int c=0; c<arr[r].length;c++)
			{
				if(arr[r][c]>max)
				{
					max=arr[r][c];
				}
				if(arr[r][c]<min)
				{
					min=arr[r][c];
				}
			}
		}
		System.out.println("Maximum element = "+max);
		System.out.println("Minimum element = "+min);
		
	}
	
//	Que 20. Write a program to count all even and odd
//	elements in a 2D array.
//	Example
//	Input: int[][] arr = { {15, 32, 9, 18},
//	 {40, 27, 56, 3},
//	 {8, 13, 22, 7},
//	 {41, 12, 17, 24} };
//	Output: Even elements count: 7
//	 Odd elements count: 9
//	Explanation: The program counts the even elements
//	and odd elements in the 2D array by checking each
//	element.
	public static void question20(int arr[][])
	{
		int evenCount=0;
		int oddCount=0;
		for(int r=0; r<arr.length;r++)
		{	
			for(int c=0; c<arr[r].length;c++)
			{
				if(arr[r][c]%2==0)
				{
					evenCount++;
				}
				else if(arr[r][c]%2!=0)
				{
					oddCount++;
				}
			}
		}
		System.out.println("Even elements count: "+evenCount);
		System.out.println("Odd elements count: "+oddCount);
		
	}

	
	
	
	public static void main(String[] args) 
	{
//		int arr[][]= { {1,2,3},{4,5,6},{7,8,9} };
//		question1(arr);
		
		
//		int arr[][]=  { {1,2,3},{4,5,6},{7,8,9} };
//		question2(arr);
		
		
//		int arr[][]= { {1,2,3},{4,5,6},{7,8,9} };
//		question3(arr);
		
		
//		int[][] arr = { {1,2,3},{4,5,6},{7,8,9} };
//		question4(arr);
		
		
//		int[][] arr = { {1,2,3},{4,5,6},{7,8,9} };
//		question5(arr);
		
		
//		int[][] arr = { {1,2,3},{4,5,6},{7,8,9} };
//		question6(arr);
		
		
//		int arr[][]={ {12,5,18},{7,16,23},{20,30,45} };
//		question7(arr);
		
		
//		int[][] arr = { {1,2,3},{4,5,6},{7,8,9} };
//		question8(arr);
		
		
//		int arr[][]={ {5,-2,3},{-4,7,-1},{8,-9,10} };
//		question9(arr);
		
		
//		int[][] arr = { {15,25,35},{40,50,60},{70,80,90} };
//		question10(arr);
		
		
//		int[][] arr = { {15,25,35},{40,50,60},{70,80,90} };
//		question11(arr);
		
		
//		int arr[][]={ {12,5,8},{22,11,18},{9,25,16} };
//		question12(arr);
		
		
//		int arr[][]={ {12,5,8},{22,11,18},{9,25,16} };
//		question13(arr);
		
		
//		int arr[][]={ {1,2,3},{4,5,6},{7,8,9} };
//		question14(arr);
		
		
//		int arr[][]={ {1,2,3},{4,5,6},{7,8,9} };
//		System.out.println(Arrays.deepToString(question15(arr)));
		
		
//		int arr[][]={ {1,2,3},{4,5,6},{7,8,9} };
//		System.out.println(Arrays.deepToString(question16(arr)));
		
		
//	    int arr[][]={ {34,12,56},{87,9,14},{42,73,5} };
//	    question17(arr);
		
//	*******
		int arr[][]={ {34,12,56},{87,9,14},{42,73,5} };
		question18(arr);
		
		
//		int arr[][]={ {34,12,56},{87,9,14},{42,73,5} };
//		question19(arr);
		
		
//		int arr[][]= { {15,32,9,18},{40,27,56,3},{8,13,22,7},{41,12,17,24} };
//		question20(arr);
		
		
		

		
		
		



		
		
		
	
	}

}
