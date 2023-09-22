import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;

public class swapElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array: ");
        int[] arr = new int[sc.nextInt()];
//        input to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        call swap
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        swap(arr, i1, i2);
//        print the swapped array
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
