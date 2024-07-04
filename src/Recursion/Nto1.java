package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        calcDec(20);
        System.out.println();
        calcAsc(20);
    }

    static void calcDec(int n) {
        if(n<1){
            return;
        }

        System.out.print(n + " ");
        calcDec(n-1);
    }

    static void calcAsc(int n) {
        if(n<1){
            return;
        }

        calcAsc(n-1);
        System.out.print(n + " ");
    }
}
