import java.util.Scanner;

public class P_Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }
    static int sqrt(int x){
        int start  = 0;
        int end = x;
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid*mid == x){
                ans = mid;
            } else if (mid*mid < x) {
                start = mid + 1;
                ans = mid;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
