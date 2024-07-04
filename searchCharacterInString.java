//import java.util.Scanner;

public class searchCharacterInString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = "Ganti Sai Sagar";
        char target = ' ';
        boolean result = search(str, target);
        System.out.println(result);
    }
    static boolean search(String string, char target){
        if (string.isEmpty()) return false;
        for (char ch: string.toCharArray()) {
            if (ch == target) return true;
        }
        return false;
    }
}
