package Backtracking;

import java.util.ArrayList;

public class PrintingPaths {
    public static void main(String[] args) {
        print("", 3, 3);
        System.out.println(printRet("", 3, 3));
        System.out.println(printRetDiagnol("", 3, 3));
    }
    static void print(String p , int r, int c){
        if( r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1){
            print(p + 'V', r - 1, c);
        }
        if (c > 1){
            print(p + 'H', r, c-1);
        }
    }
    static ArrayList<String > printRet(String p , int r, int c){
        if( r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(printRet(p + 'V', r - 1, c));
        }
        if (c > 1){
            list.addAll(printRet(p + 'H', r, c-1));
        }
        return list;
    }
    static ArrayList<String > printRetDiagnol(String p , int r, int c){
        if( r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1){//diagnol
            list.addAll(printRetDiagnol(p + 'D', r-1, c-1));
        }
        if (r > 1){
            list.addAll(printRetDiagnol(p + 'V', r - 1, c));
        }
        if (c > 1){
            list.addAll(printRetDiagnol(p + 'H', r, c-1));
        }
        return list;
    }
}
