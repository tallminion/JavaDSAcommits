package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-8, -6, -4, 0, 2, 4, 7, 8, 10, 18, 22, 64, 78, 98};
        int[] arr = {23, 22, 10, 9, 3, 0, -1, -5};
        int target = 3;
        int ans = sortTest(arr, target);
        System.out.println(ans);
    }

    static int binarySearchDesc(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target<array[mid]){
                start = mid+1;
            }else if(target>array[mid]){
                end = mid-1;
            }else return mid;
        }

        return -1;
    }
    static int binarySearchAsc(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target<array[mid]){
                end = mid-1;
            }else if(target>array[mid]){
                start = mid+1;
            }else return mid;
        }

        return -1;
    }

    static int sortTest(int[] array, int target){
        int length = array.length-1;
        if(array[0]>array[length]){
            return binarySearchDesc(array, target);
        } else if(array[0]<array[length]){
            return binarySearchAsc(array, target);
        } else return -1;

    }
}
