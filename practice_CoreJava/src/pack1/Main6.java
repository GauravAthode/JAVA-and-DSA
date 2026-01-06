package pack1;

public class Main6 
{
	public static int  search(int matrix[][],int target)
	{

		int r=0;
		int c=matrix[r].length-1;
		while(r<matrix.length && c>0)
		{
			if(matrix[r][c]==target)
			{
				return target;
			}
			else if(matrix[r][c]>target)
			{
				c--;
			}
			else
			{
				r++;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) 
	{
		int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
		int target =14;
		System.out.println(search(matrix, target));

	}

}
