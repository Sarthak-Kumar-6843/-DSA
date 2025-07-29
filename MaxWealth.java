public class MaxWealth {
    public static void main(String[] args) {
            int[][] account = {
                    {12,4,5},
                    {13,3,4},
                    {14,5,7},
                    {15,13,9}
            };
        System.out.println(maxWealth(account));
    }
    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];

            }
            //now  we have sum of accounts of person
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}