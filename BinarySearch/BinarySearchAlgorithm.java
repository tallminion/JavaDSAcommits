package BinarySearch;
// array is sorted in Ascending order
public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-8, -6, -4, 0, 2, 4, 7, 8, 10, 18, 22, 64, 78, 98};
        int target = 64;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else return mid;
        }

        return -1;

    }
}
