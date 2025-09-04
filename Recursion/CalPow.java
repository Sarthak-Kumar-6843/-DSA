package Recursion;

public class CalPow {
    public static void main(String[] args) {

        System.out.println(calPow(2,5));

    }
    public static int calPow(int x , int n){

        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int xPownm1 = calPow(x,n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
}
