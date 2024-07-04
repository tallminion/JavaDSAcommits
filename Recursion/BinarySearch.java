package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 9, 25, 79};
        int target = 0;
        int ans = bs(array, target, 0, array.length-1);
        System.out.println(ans);
    }

    static int bs(int[] arr, int target, int start, int end){
        if(start>end) return -1;
        int mid = start + (end - start)/2;
        if(arr[mid]==target) return mid;
        if(target>arr[mid]) return bs(arr, target, mid+1, end);
        return bs(arr, target, start ,mid-1);
    }
}
