//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int number:nums) {
            if(even(number)) count++;
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digitsCount(num);
        return numberOfDigits%2==0;
    }
    static int digitsCount(int num){
        int count = 0;
        if(num==0) return 1;
        if(num<0) num*=-1;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
