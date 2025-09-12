package SubsetsRecr;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
//        Subseq("","abc");
//        System.out.println( SubseqRet("","abc"));
        System.out.println(SubseqAscii("","abc"));
    }
    static void Subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Subseq(p,up.substring(1));
        Subseq(p + ch,up.substring(1));
    }

    static ArrayList<String> SubseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =  SubseqRet(p,up.substring(1));
        ArrayList<String> right = SubseqRet(p + ch,up.substring(1));

        left.addAll(right);
        return left;
    }

    static boolean SubseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return false;
        }
        char ch = up.charAt(0);
        SubseqAscii(p,up.substring(1));
        SubseqAscii(p + ch,up.substring(1));
        SubseqAscii(p + (ch+0),up.substring(1));
        return false;
    }
}
