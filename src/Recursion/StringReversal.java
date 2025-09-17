package Recursion;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println(str("hello"));
    }
    static String str(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        return str(str.substring(1)) + ch;
//        return ch + str(str.substring(1));will give hello
    }
}
