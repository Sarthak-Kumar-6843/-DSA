import java.util.Scanner;

public class GuessNumHighOrLow {
    public static void main(String[] args) {

    }



    int guess(int n){
        int start = 1;
        int end = n - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (guess(mid) == 0){
                return mid;
            } else if (guess(mid) > 0) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return n;
    }
}




