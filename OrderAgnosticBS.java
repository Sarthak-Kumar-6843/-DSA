public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-79,-12,-11,-7,-2,2,13,14,16,22,34,54,65,76,96};
        System.out.println(orderAgnosticBS(arr,34));

    }
    static int orderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        //find whether array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find middle element
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
