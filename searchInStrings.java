import java.util.Objects;
import java.util.Scanner;

public class searchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char target = in.next().charAt(0);

        boolean result = search(word, target);
        System.out.println("Result: " + result);
    }
    static boolean search(String word , char target){

        if (word.length() == 0){
            return false;
        }



        for(char ch : word.toCharArray()){

            if (ch == target) {
                System.out.println(target);
                return true;
            }
        }
        return false;
    }

}
