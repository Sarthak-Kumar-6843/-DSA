public class CalPowLogN {
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

        if(n%2 == 0){
          return   calPow(x,n/2)*calPow(x,n/2);
        }else {
            return calPow(x,n/2)*calPow(x,n/2)*x;
        }

    }
}
