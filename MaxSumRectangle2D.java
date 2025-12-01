import java.util.*;

public class MaxSumRectangle2D {

    // Standard Kadane for 1D array
    public static int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    // Main function to find max sum rectangle
    public static int maxSumRectangle(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;

        int maxSum = Integer.MIN_VALUE;

        // FIX a left column
        for (int left = 0; left < C; left++) {

            // temp array for row-wise collapse
            int[] temp = new int[R];

            // FIX a right column
            for (int right = left; right < C; right++) {

                // Collapse rows into temp array
                for (int row = 0; row < R; row++) {
                    temp[row] += mat[row][right];
                }

                // Apply Kadane on temp[]
                int kadaneResult = kadane(temp);

                // Compare with global
                maxSum = Math.max(maxSum, kadaneResult);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  m = sc.nextInt();

        int[][] mat = new int[n][m];

        for(int i = 0 ; i< n ; i++){
            for(int j= 0 ; j< m ;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Maximum sum rectangle: " + maxSumRectangle(mat));
        sc.close();
    }
}
