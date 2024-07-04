package BinarySearchIn2DArray;
//Search in a row wise and column wise sorted matrix
import java.util.Arrays;

public class RowColSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 35;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrixArray, int target){
        int row = 0;
        int col = matrixArray.length-1;
            while(row < matrixArray.length && col >= 0){
                if (matrixArray[row][col]==target){
                    return new int[] {row, col};
                } else if (matrixArray[row][col]<target) {
                    row++;
                } else col--;
            }
            return new int[]{-1, -1};
    }
}

