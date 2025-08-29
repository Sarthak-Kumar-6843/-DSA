public class FInd_iThbit {
    public static void main(String[] args) {
        int n = 5;
        int i = 3;
        int ans = bit(n,i);
        System.out.println(ans);
    }
    static int bit(int n , int i){
        int bitMask = 1 << (i-1);

        return n & bitMask;
    }
}
