import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputs = in.next() ;

        String result = "";//empty string
        for (int i = 0; i < inputs.length(); i++) {
            if (inputs.charAt(i) == 'e'){
                result += 'i';
            }else {
                result += inputs.charAt(i);
            }
        }

        System.out.println(result);


    }
}
