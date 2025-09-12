package StringsRecursion;

public class SkipA {
    public static void main(String[] args) {
        String org = "bappeccad";
        System.out.println(skipAppnotApple(org));
    }

    static void skip(String org, String ans) {
        if (org.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = org.charAt(0);
        if (ch == 'a') {
            skip(org.substring(1), ans); // skip 'a'
        } else {
            skip(org.substring(1), ans + ch); // keep other chars
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppnotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && ! up.startsWith("apple")){
            return skipAppnotApple(up.substring(3));
        }else {
            return up.charAt(0) + skipAppnotApple(up.substring(1));
        }
    }
}
