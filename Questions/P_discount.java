package Questions;

import java.util.Scanner;

public class P_discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int discount = 15;
        double price = in.nextInt();
        double discounted_amount = (price*discount)/100;
        double discounted_price = price - discounted_amount ;
        System.out.println(discounted_price);
    }
}
