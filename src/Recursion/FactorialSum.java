package Recursion;

public class FactorialSum {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println();
        System.out.println(sum(5));
    }

    static Integer factorial(int n) {
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static Integer sum(int n) {
        if(n<=1){
            return 1;
        }
        return n + sum(n-1);
    }
}
