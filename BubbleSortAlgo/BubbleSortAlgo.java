package BubbleSortAlgo;

import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {63, 56, 89, 12, 90};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] array){
        boolean swapped = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j]<array[j-1]){
                    swap(array, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// space complexity -> O(N^2)
