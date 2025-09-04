package Recursion;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "abcd";
        int idx = str.length() - 1;

        rev(str,idx);
    }
    public static void rev(String str , int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        rev(str,idx-1);
    }
}
