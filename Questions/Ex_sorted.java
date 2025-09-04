package Questions;

import java.util.Scanner;

public class Ex_sorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < num.length ; i++) {
            num[i] = in.nextInt();
        }

        sorted(num);

    }
    public static void sorted(int[] num ){
        boolean isAsc = true;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i+1]){
                isAsc = false;
            }
        }

        if(isAsc){
            System.out.println("Ascending");
        }else {
            System.out.println("Descending");
        }
    }
}
