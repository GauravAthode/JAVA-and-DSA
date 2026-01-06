package array2DPracticeAssignmentPart2;

import java.util.*;

import javax.naming.InterruptedNamingException;

public class Main 
{
//	Que 1. Write a program to search for a specific
//	element in a 2D array and print its value along with its
//	index (row and column) if found. If the element is not
//	found, display "Element not found".
//	Example
//	Input: {{11, 12, 13},
//	 {14, 15, 16},
//	 {17, 18, 19}};
//	Element: 16
//	Output: Element 16 found at index: [1][2]
//	Explanation: The program checks each element in the
//	2D array and finds the element 16 at row 1, column 2.
//	Input: {{21, 22, 23},
//	 {24, 25, 26},
//	 {27, 28, 29}};
//	 Element: 30
//	 Output: Element not found
//	 Explanation: The program searches through the 2D
//	 array and does not find the element 30, so it outputs
//	 "Element not found".
	public static void question1(int arr[][],int target)
	{
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				if(arr[r][c]==target)
				{
					System.out.print("Element "+target+" found at index:"+"["+r+"]["+c+"]");
					return;
				}	
			}
		}
		System.out.println("Element not found");
	}
	
//	Que 2. Write a program to perform the addition of two
//	matrices. The program should take two 2D arrays of
//	the same size as input and output their sum matrix.
//	Example
//	Input: Matrix A: { {2, 4, 6},
//	 {8, 10, 12},
//	 {14, 16, 18} };
//	 Matrix B: { {1, 3, 5},
//	 {7, 9, 11},
//	 {13, 15, 17} };
//	Output: 3 7 11
//	 15 19 23
//	 27 31 35
//	 Explanation: The program adds the corresponding
//	 elements of two matrices and generates a new matrix
//	 as the result.
	public static void question2(int arr1[][],int arr2[][])
	{
		for(int r=0;r<arr1.length;r++)
		{
			for(int c=0; c<arr1[r].length;c++)
			{
				System.out.print(arr1[r][c]+arr2[r][c]+" ");
			}
			System.out.println();
		}
	}
	
//	Que 3. Write a program to perform the subtraction of
//	two matrices. The program should take two 2D arrays
//	of the same size as input and output their difference
//	matrix. If the matrices have different dimensions,
//	display an error message indicating that subtraction is
//	not possible.
//	Example
//	Input: Matrix A: { {15, 20, 25},
//	                   {30, 35, 40},
//	 					{45, 50, 55} };
//	 Matrix B: { {5, 10, 15},
//	             {10, 15, 20},
//	             {15, 20, 25} };
//	Output: 10 10 10
//	 20 20 20
//	 30 30 30
//	Explanation: The program subtracts the corresponding
//	elements of Matrix B from Matrix A to generate the
//	Difference Matrix.
//	Input: Matrix A: { {100, 200, 300},
//	                   {400, 500, 600} } ;
//	 Matrix B: { {10, 20},
//	             {30, 40},
//	             {50, 60} };
//	Output: Matrix subtraction not possible: Matrices have
//	different dimensions.
//	Explanation: The program checks the matrix
//	dimensions and outputs an error message because
//	Matrix A (2×3) and Matrix B (3×2) have different sizes,
//	making subtraction impossible.
	public static void question3(int arr1[][],int arr2[][])
	{
		if(arr1.length==arr2.length && arr1[0].length==arr2[0].length)
		{
			for(int r=0; r<arr1.length;r++)
			{
				for(int c=0; c<arr1[r].length;c++)
				{
					System.out.print(arr1[r][c]-arr2[r][c]+" ");
				}
				System.out.println();
			}
		}
		else 
		{
			System.out.println("Matrix subtraction not possible: Matrices have different dimensions.");
			
		}	
	}
	
//	Que 4. Write a Java program to perform the
//	multiplication of two matrices. The program should
//	take two 2D arrays as input and output their product
//	matrix. If the matrices cannot be multiplied (i.e., the
//	number of columns in the first matrix is not equal to
//	the number of rows in the second matrix), display an
//	error message indicating that multiplication is not
//	possible.
//	Example
//	Input: Matrix A: { {1, 2},
//	 {3, 4} };
//	 Matrix B: { {5, 6},
//	 {7, 8} };
//	Output: 19 22
//	 43 50
//	Explanation: The program multiplies Matrix A with
//	Matrix B by performing the dot product of rows and
//	columns to generate the Product Matrix.
//	Input: Matrix A: { {2, 3, 4},
//	 {1, 0, 5} };
//	 Matrix B: { {1, 2},
//	             {3, 4},
//	             {5, 6} };
//	Output: 43 50
//	        26 30
//	Explanation: The program multiplies Matrix A with
//	Matrix B by performing the dot product of rows and
//	columns to generate the Product Matrix.
//	Input: Matrix A: { {1, 2, 3},
//	 {4, 5, 6} };
//	 Matrix B: { {7, 8},
//	 {9, 10} };
//	Output: Matrix multiplication not possible: Number of
//	columns in Matrix A must equal number of rows in
//	Matrix B.
//	Explanation:
//	The program outputs an error because the number of
//	columns in Matrix A (3) does not match the number of
//	rows in Matrix B (2), preventing matrix multiplication.
	public static void question()
	{
		
	}
	
//	Que 5. Write a program to perform wave traversal of a
//	2D matrix. In wave traversal, you traverse the matrix in
//	a zig-zag pattern: first down the first column, then up
//	the second column, and so on, alternating between
//	down and up for each column.
//	Example
//	Input: Matrix: { {10, 20, 30, 40},
//	 {50, 60, 70, 80},
//	 {90, 100, 110, 120},
//	 {130, 140, 150, 160} };
//	Output: 10 50 90 130 140 100 60 20 30 70 110 150 160
//	120 80 40
//	Explanation:
//		• First column (0th column): Traverse Top to Bottom
//		→ 10, 50, 90, 130
//		• Second column (1st column): Traverse Bottom to
//		Top → 140, 100, 60, 20
//		• Third column (2nd column): Traverse Top to
//		Bottom → 30, 70, 110, 150
//		• Fourth column (3rd column): Traverse Bottom to
//		Top → 160, 120, 80, 40
	public static void question5(int arr[][])
	{
		for(int r=0; r<arr.length;r++)
		{
			if(r%2==0)
			{
				for(int c=0; c<arr[r].length;c++)
				{
					System.out.print(arr[c][r]+" ");
				}
			}
			else
			{
				for(int c=arr[r].length-1; c>=0;c--)
				{
					System.out.print(arr[c][r]+" ");
				}
			}
		}
	}

	
//	Que 7. Write a program to perform snake traversal of
//	the given 2D matrix. Snake traversal of a matrix
//	involves traversing it in a zigzag manner. For example,
//	the first row is traversed left to right, the second row is
//	traversed right to left, and so on.
//	Example
//	Input: 1 2 3 4
//	 5 6 7 8
//	 9 10 11 12
//	Output: 1 2 3 4 8 7 6 5 9 10 11 12
//	Explanation:
//	• First row: Left to right → 1, 2, 3, 4
//	• Second row: Right to left → 8, 7, 6, 5
//	• Third row: Left to right → 9, 10, 11, 12
	public static void question7(int arr[][])
	{
		for(int r=0; r<arr.length;r++)
		{
			if(r%2==0)
			{
				for(int c=0; c<arr[r].length;c++)
				{
					System.out.print(arr[r][c]+" ");
				}
			}
			else
			{
				for(int c=arr[r].length-1; c>=0;c--)
				{
					System.out.print(arr[r][c]+" ");
				}
			}
		}
	}
	
//	Que 8. Write a program to perform a half diagonal
//	traversal of the given 2D array. Start from the leftmost
//	diagonal(traversal begins from the top-left corner) and
//	continue until all elements above and on the main
//	diagonal are covered.
//	Example
//	Input: 5 10 15
//	 20 25 30
//	 35 40 45
//	Output: 5 25 45 10 30 15
//	Explanation: Main diagonal elements: 5, 25, 45
//	 Diagonal elements above main diagonal:
//	o From Row 0: 10, 30
//	o From Row 0: 15
	public static void question8(int arr[][])
	{
		for(int k=0; k<arr.length;k++)
		{
			for(int i=0,j=k;j<arr.length;i++,j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	
//	Que 9. Given a square matrix of order N*N, write code
//	to print all the elements in the order of their diagonal.
//	For example, in the below matrix, the elements should
//	be printed in the marked (in red) order, and the final
//	output should be as shown below:
//	Example
//	Input: 1 2 3 4 
//	 5 6 7 8 
//	 9 10 11 12
//	 13 14 15 16
//	Output: 1 5 2 9 6 3 13 10 7 4 14 11 8 15 12 16
	public  static void question9(int arr[][]) 
	{
		for(int k=0; k<arr.length;k++)
		{
			for(int c=0,j=k; j>=0;c++,j--)
			{
				System.out.print(arr[j][c]+" ");
			}
		}
		for(int k=0,i=1;k<arr.length;k++,i++)
		{
			for(int c=i,j=arr.length-1; c<arr.length;c++,j--)
			{
				System.out.print(arr[j][c]+" ");
			}
		}
		
	}
	
//	Que 10. Write a program to perform a snake diagonal
//	zigzag traversal of a 2D array. The traversal should
//	alternate between upward and downward directions
//	for each diagonal.
//	Example
//	Input: 10 20 30 40
//	 50 60 70 80
//	 90 100 110 120
//	 130 140 150 160
//	 Output: 10
//	 20 50
//	 90 60 30
//	 40 70 100 130
//	 140 110 80
//	 120 150
//	 160
//	Explanation:
//	• Diagonal 1 (upwards): 10
//	• Diagonal 2 (downwards): 20, 50
//	• Diagonal 3 (upwards): 90, 60, 30
//	• Diagonal 4 (downwards): 40, 70, 100, 130
//	• Diagonal 5 (upwards): 140, 110, 80
//	• Diagonal 6 (downwards): 120, 150
//	• Diagonal 7 (upwards): 160
	public static void question10(int arr[][])
	{
		
	}


	public static void main(String[] args) 
	{
//		int arr[][]= { {11,12,13},{14,15,16},{17,18,19} };
//		int element=16;
//		question1(arr,element);
		
		
//		int matrixA[][]= { {2,4,6},{8,10,12},{14,16,18} };
//		int matrixB[][]= { {1,3,5},{7,9,11},{13,15,17} };
//		question2(matrixA, matrixB);
		
		
//		int matrixA[][]={ {15,20,25},{30,35,40},{45,50,55} };
//		int matrixB[][]={ {5,10,15},{10,15,20},{15, 20, 25} };
//		question3(matrixA,matrixB);
		
		
//		int arr[][]={ {10,20,30,40},{50, 60, 70, 80},{90,100,110,120},{130,140,150,160} };
//		question5(arr);
		
		
//		int arr[][]= { {1,2,3,4},{5,6,7,8},{9,10,11,12} };
//		question7(arr);
		
		
//		int arr[][]= { {5,10,15},{20,25,30},{35,40,45} };
//		question8(arr);
		
		
		int arr[][]= { {1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
		question9(arr);


	}

}
