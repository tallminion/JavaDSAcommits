import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
//        declaration
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);

//        intializing and declaring an Arraylist of arraylist
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(in.nextInt());
            }
        }
        System.out.println(arr);
    }
}
