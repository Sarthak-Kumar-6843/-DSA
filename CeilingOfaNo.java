public class CeilingOfaNo {
    public static void main(String[] args) {
        int[] arr = {-79,-12,-11,-7,-2,2,13,14,16,22,34,54,65,76,96};
        System.out.println(Ceiling(arr,36));
    }
    static int Ceiling(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //find mid
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return  start;
    }
}
