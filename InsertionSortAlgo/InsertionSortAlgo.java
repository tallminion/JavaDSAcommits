package InsertionSortAlgo;

import java.util.Arrays;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j]<=arr[j-1]){
                    swap(arr, j, j-1);
                } else break;
            }
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

//best case time complexity -> O(N^2) when the given array is descending sorted
//worst case time complexity -> O(N) when the given array is ascending sorted
