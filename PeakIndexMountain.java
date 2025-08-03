public class PeakIndexMountain {
    public static void main(String[] args) {

    }

    public int peakIndexMountainArray(int[] arr , int peak){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2 ;
            if(arr[mid] > arr[mid + 1]){
                //this maybe the answer
                //but we still check on left
                //this why end != mid -1
                end = mid;
            }else {
                //you are in asc part of array
                start = mid + 1; // mid + 1 element > mid
            }
        }
        //in the end , start == end because of above 2 checks and will be pointing to largest num
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
}
