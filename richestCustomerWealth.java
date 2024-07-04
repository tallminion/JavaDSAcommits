public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(array));
    }
    static int maximumWealth(int[][] accounts) {
        int rowSum = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;

            for (int i : account) {
                sum += i;
            }
            if (sum > rowSum) {
                rowSum = sum;
            }
        }
        return rowSum;
    }
}
