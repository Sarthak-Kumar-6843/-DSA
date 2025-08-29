public class productOfdigit {
    public static void main(String[] args) {
        System.out.println(product(1342));
    }

    static int product(int n){
        if(n%10 == n){
            return n;
        }

        int rem = n % 10;
        n = n / 10;

        return rem * product(n);
    }
}
