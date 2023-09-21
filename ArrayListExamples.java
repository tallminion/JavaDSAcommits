import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
//        when we don't know how much sized array we need, we use ArrayList
//        Syntax to
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(67);
        arrayList.add(934);
        arrayList.add(167);
        arrayList.add(578);
        arrayList.add(373);
        arrayList.add(957);
        arrayList.add(6);

//        to remove element from nth index
        System.out.println(arrayList.remove(3));
//        to check if an element exists in an arrayList
        System.out.println(arrayList.contains(578));
//        to print the elements of an array
        System.out.println(arrayList);
//        to fetch element at nth index
        for (int i = 0; i < 6 ; i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
