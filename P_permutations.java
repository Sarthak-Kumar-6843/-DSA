import java.util.Arrays;
import java.util.Scanner;

public class P_permutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = {0,2,4,3,5};
        int[] arr = new int[n.length];

        for (int i = 0; i < n.length; i++) {
            arr[i] = n[n[i]];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
