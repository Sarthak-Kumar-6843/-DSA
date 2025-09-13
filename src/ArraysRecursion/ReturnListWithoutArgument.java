package ArraysRecursion;

import java.util.ArrayList;

public class ReturnListWithoutArgument {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8, 3, 2};
        int target = 3;
        System.out.println(find(arr,target,0));
    }
    static ArrayList<Integer> find(int[] arr, int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = find(arr,target,index + 1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}
