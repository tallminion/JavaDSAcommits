public class Palindrome {
//    check if a string is palindrome or not
public static void main(String[] args) {
    String str = null;
    System.out.println(palin(str));
}
static boolean palin(String str){

    if(str==null || str.isEmpty()) {
        return true;
    }
    str = str.toLowerCase();
    for (int i = 0; i <= str.length()/2; i++) {
        char start = str.charAt(i);
        char end = str.charAt(str.length()-1-i);
        if (start!=end) return false;
    }
    return true;
}

}
