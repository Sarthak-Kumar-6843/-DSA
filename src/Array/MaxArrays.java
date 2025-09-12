package Array;

public class MaxArrays {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7};
        System.out.println(maxRange(arr, 1 , 3));
    }
    static int maxRange(int[] arr , int start ,int end ){
        int maxVal = arr[0];
        for (int i = 2; i <= end ; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
