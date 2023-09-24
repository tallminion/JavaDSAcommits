import java.util.Scanner;

public class findMinMaxInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter the array element at " +i);
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the starting index: ");
        int start = sc.nextInt();
        System.out.println("enter the ending index: ");
        int end = sc.nextInt();
        int min = min(arr, start, end);
        int max = max(arr, start, end);
        System.out.println(min);
        System.out.println(max);
    }
    static int min(int[] array, int start, int end){
        int min = array[start];
        for (int i = start+1; i <= end; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    static int max(int[] array, int start, int end){
        int max = array[start];
        for (int i = start+1; i <= end; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
