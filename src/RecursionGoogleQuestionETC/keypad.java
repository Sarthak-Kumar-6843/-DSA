package RecursionGoogleQuestionETC;

import java.util.ArrayList;

public class keypad {
    public static void main(String[] args) {
//        pad("","342");
        System.out.println(padRet("","12"));
        System.out.println(padC("","12"));
    }
    static void pad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';//convert '2' to 2.
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }
    static ArrayList<String> padRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';//convert '2' to 2.

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }
    static int padC(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';//convert '2' to 2.
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count += padC(p + ch, up.substring(1));
        }
        return count;
    }
}
