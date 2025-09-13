package ArraysRecursion;

import java.util.ArrayList;

public class ReturnArraylist {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8, 2};
        int target = 3;
        System.out.println(findAllIndexes(arr,0,target,new ArrayList<>()));
    }

    static ArrayList<Integer> findAllIndexes(int[] arr, int index, int target ,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
       return findAllIndexes(arr,index + 1,target, list);
    }
}
