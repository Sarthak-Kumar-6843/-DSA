package Questions;

import java.util.Scanner;

public class P_distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double initial = in.nextDouble();
        double end = in.nextDouble();

        if(end >= initial){
            double distance = end - initial;
            System.out.println(distance);
        }else {
            System.out.println("distance can't be negative");
        }

    }
}
