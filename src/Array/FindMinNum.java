package Array;

public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = {28, 45, 65, 76, 34, 23, 54, 32, 102, 75, 98, 12, 31, 49, 54, 65};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
