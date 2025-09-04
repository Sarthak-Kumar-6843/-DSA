package Recursion;

public class factorial_recur {
    public static void main(String[] args) {
      int ans = calFactorial(5);
        System.out.println(ans);
    }
    public static int calFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }

       int fact_nm1 = calFactorial(n-1);
       int fact_n = n*fact_nm1;
       return fact_n;

    }
}
