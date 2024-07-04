import java.util.Scanner;

public class maxValueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array: ");
        int[] arr = new int[sc.nextInt()];
//        input to array
        System.out.println("please enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        call maxFunction
        System.out.println(max(arr));
    }
    static int max (int[] array){
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
