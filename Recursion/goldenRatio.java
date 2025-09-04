package Recursion;

public class goldenRatio {
    public static void main(String[] args) {
//        for (int i = 0; i < 25; i++) {
//            System.out.println(fibFOrmula(i));
//        }
        System.out.println(fibFOrmula(50));
    }

    static double fibFOrmula(int n){
        return  (int)(Math.pow(((1+Math.sqrt(5))/2),n)  / Math.sqrt(5));
    }
}
