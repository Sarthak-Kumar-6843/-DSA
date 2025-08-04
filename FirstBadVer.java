public class FirstBadVer {
    public static void main(String[] args) {

    }

    boolean isBadVersion(int version){
        if(isBadVersion(version) ifirstBadVersion(version))
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (firstBadVersion(mid) == 0){
                return mid;
            } else if (firstBadVersion(mid) > 0) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
