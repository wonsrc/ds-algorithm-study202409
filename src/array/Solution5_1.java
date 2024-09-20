package array;

import javax.tools.ForwardingFileObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution5_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j <N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());

            }

        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < N; j++) {
                rowSum += grid[i][j];
                colSum += grid[j][i];

            }

            maxSum = Math.max(maxSum, rowSum);
            maxSum = Math.max(maxSum, colSum);
        }

        int diag1Sum = 0;
        int diag2Sum = 0;

        for (int i = 0; i < N; i++) {
            diag1Sum += grid[i][i];
            diag2Sum += grid[i][N-1-i];
        }

        maxSum = Math.max(maxSum, diag1Sum);
        maxSum = Math.max(maxSum, diag2Sum);

        System.out.println(maxSum);
    }
}
