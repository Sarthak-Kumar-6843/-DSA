import java.util.Scanner;

public class MInsam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < arr.length; i++) {
            int min = arr[0];
            arr[i] = in.nextInt();
            if(arr[i] < min){
                min = arr[i];
                System.out.println(min);
            }

        }

    }
}
