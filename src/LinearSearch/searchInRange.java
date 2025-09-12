package LinearSearch;

import java.util.Scanner;

public class searchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1,45,65,76,34,23,54,6,5,75,98,12,3,4,54,65};
        int target = 98;
        System.out.println(search(arr,target,5,12));;
    }
    static boolean search(int[] num , int target , int start , int end){
        for (int i = start; i < end; i++) {
            if (target == num[i]) {
                return true;
            }
        }
        return false;
    }
}
