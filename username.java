import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input email : ");
        String email = in.next();

        String user = email.substring(1);


        String Username = "";
        for (int i = 0; i < user.length(); i++) {
            if(user.charAt(i) == '@'){
                break;
            }else {
                Username += user.charAt(i);
            }

        }
        System.out.print("Username is " + Username);
    }
}
