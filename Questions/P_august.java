package Questions;

public class P_august {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i <= 31 ; i++) {
            if (i%2 == 0){
                count ++;
            }

        }
        System.out.println(count);
    }
}
