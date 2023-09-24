import java.util.Scanner;

public class findMaxInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter the array element at " +i);
            arr[i] = sc.nextInt();
        }
        int min = max(arr);
        System.out.println(min);
    }
    static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
