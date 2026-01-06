package pack1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Read the dimensions of the matrix
	        int N = scanner.nextInt();
	        int M = scanner.nextInt();
	        
	        // Read the matrix
	        int[][] matrix = new int[N][M];
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	        
	        // Read the block identity K
	        int K = scanner.nextInt();
	        
	        // Set to track the unique blocks that need to be removed
	        Set<Integer> removedBlocks = new HashSet<>();
	        
	        // Process each column to find blocks to remove
	        for (int j = 0; j < M; j++) {
	            // We need to find all blocks stacked above block K
	            boolean foundK = false;
	            for (int i = 0; i < N; i++) {
	                if (matrix[i][j] == K) {
	                    foundK = true;
	                }
	                // If we have found block K, remove all blocks above it in this column
	                if (foundK) {
	                    removedBlocks.add(matrix[i][j]);
	                }
	            }
	        }
	        
	        // Output the number of unique blocks that need to be removed
	        System.out.println(removedBlocks.size());

	}

}
