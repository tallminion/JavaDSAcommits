package BinarySearchIn2DArray;
// Matrix is purely sorted
import java.util.Arrays;

public class SortedMatrixBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 15;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int[][] matrix, int target){
        int start = 0;
        int end = matrix.length-1;
        while(start< matrix.length && end >=0){
            if(matrix[start][end]==target){
                return new int[] {start, end};
            } else if (matrix[start][end]<target) {
                start++;
            } else end--;
        }
        return new int[]{-1, -1};
    }
}
