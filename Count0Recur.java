public class Count0Recur {
    public static void main(String[] args) {
        int n = 30204;
        System.out.println(count(n));
    }

    static int count(int n){
        if(n == 0){
            return 0;
        }

        int rem = n % 10;

        if(rem == 0){
            return 1 + count(n/10);
        }
        return count(n/10);
    }
}
