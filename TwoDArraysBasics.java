import java.util.Scanner;

public class TwoDArraysBasics {
    public static void main(String[] args) {
        System.out.println("hello World");
        Scanner in = new Scanner(System.in);
//input to 2D-Array
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println("enter value");
                arr[row][col] = in.nextInt();
            }
        }

//output from 2D-Array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
