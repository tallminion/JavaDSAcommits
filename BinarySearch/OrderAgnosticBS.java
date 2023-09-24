package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {-8, -6, -4, 0, 2, 3, 4, 7, 8, 10, 18, 22, 64, 78, 98};
        int[] arr2 = {23, 22, 10, 9, 3, 0, -1, -5};
        int target = 3;
        int ans1 = sortTest(arr1, target);
        int ans2 = sortTest(arr2, target);

        System.out.println(ans1);
        System.out.println(ans2);

    }
//     check if array is ascending sorted or descending sorted
//    than perform BS accordingly
    static int sortTest(int[] array, int target){
        int length = array.length-1;
        if(array[0]>array[length]){
            return binarySearchDesc(array, target);
        } else if(array[0]<array[length]){
            return binarySearchAsc(array, target);
        } else return -1;

    }

//    BS for Descending sorted Array
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

    //    BS for Ascending sorted Array
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


}
