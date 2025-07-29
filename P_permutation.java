import java.util.Arrays;

public class P_permutation {
    public static void main(String[] args) {
        int[] num = {0 , 3  , 1 , 2 };

        int[] ans = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            ans[i] = num[num[i]];
        }

        System.out.println(Arrays.toString(ans));
    }
}
