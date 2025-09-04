package Recursion;

public class subseq {
    public static void main(String[] args) {
        String str = "abc";
        subseq(str,0,"");
    }
    public static void subseq(String str,int idx ,String newString){

        if (idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // to be printed
        subseq(str,idx+1,newString + currChar);

        //to not be
        subseq(str,idx+1,newString);
    }
}
