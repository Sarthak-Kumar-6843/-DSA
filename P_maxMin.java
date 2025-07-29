import java.util.Scanner;

public class P_maxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        max(a,b,c);
        min(a,b,c);
    }
    static  void max(int a , int b, int c){

        int max = a;
        if(max < b){
            max = b;
        } if (max < c) {
            max = c;
        }
        System.out.println(max);
    }

    static void min(int a , int b , int c){
        int min = a;
        if(min > b){
            min = b;
        }  if (min > c) {
            min = c;
        }
        System.out.println(min);
    }
}
