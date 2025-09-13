package ArraysRecursion;

import java.util.ArrayList;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8, 2};
        int target = 3;
        System.out.println(search(arr,0,target));
        System.out.println(find(arr,0,target));
        findAllIndexes(arr,0,target);
        System.out.println(list);
    }
    static boolean search(int[] arr , int index, int target){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,index + 1,target);
    }
    static int find(int[] arr, int index, int target){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return find(arr,index + 1 ,target);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndexes(int[] arr, int index, int target){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndexes(arr,index + 1,target);
    }

}
