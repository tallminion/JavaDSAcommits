import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {23, 45, 1, 2, 8, 19, -3, 2, -11, 28};
        System.out.println("enter the target element to be searched: ");
        int target = sc.nextInt();
        int result = linearSearchFunc(array, target);
        System.out.println(result);
    }
    static int linearSearchFunc(int[] arr, int target){
        if (arr.length==0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
             return i;
            }
        }

        return -1;
    }
}
