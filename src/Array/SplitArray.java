package Array;

public class SplitArray {
    public static void main(String[] args) {

    }
    static int splitArray(int[] nums , int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {

            start = Math.max(start,nums[i]);//in this loop it will contain the max item from the array
            end += nums[i];

        }
        while (start < end){
            int mid = start + (end - start)/2;
            int sum = 0 ;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid){
                    //you cannot add this in sub array
                    //you can add this in new subarray
                    sum = num;
                    pieces++;
                }else {
                    start += num;
                }
            }
            if (pieces > mid){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return end;//here start == end
    }
}
