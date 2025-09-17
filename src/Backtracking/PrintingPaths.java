package Backtracking;

import java.util.ArrayList;

public class PrintingPaths {
    public static void main(String[] args) {
        print("", 3, 3);
        System.out.println(printRet("", 3, 3));
    }
    static void print(String p , int r, int c){
        if( r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1){
            print(p + 'D', r - 1, c);
        }
        if (c > 1){
            print(p + 'R', r, c-1);
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
            list.addAll(printRet(p + 'D', r - 1, c));
        }
        if (c > 1){
            list.addAll(printRet(p + 'R', r, c-1));
        }
        return list;
    }
}
