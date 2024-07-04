package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(calc(1234));
    }

    static int calc(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+calc(num/10);
    }
}
