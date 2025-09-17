package Questions;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(pow(5,6));
    }
    static int pow(int n , int x){
        if( x == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return n*pow(n,x-1);
    }
}
