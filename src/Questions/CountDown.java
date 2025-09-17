package Questions;

public class CountDown {
    public static void main(String[] args) {
        count(5);
    }
    static void count(int n){
        if ( n == 0){
            return;
        }
        System.out.println(n);
        count(n - 1);
    }
}
