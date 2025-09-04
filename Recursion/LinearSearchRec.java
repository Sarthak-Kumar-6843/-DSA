package Recursion;

import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 , 9 ,12,12};

//        System.out.println(search(arr,12,0));
//        System.out.println(search2(arr,12,0));
//        System.out.println(search3last(arr,12,arr.length-1));
//        search4all(arr,12,0);
//        System.out.println(list);
//        search4all2(arr,12,0,list);

        ArrayList<Integer> ans = search5all2(arr,12,0);
        System.out.println(ans);
    }



    static boolean search(int[] arr, int target ,int index){
        if(index == arr.length ){
            return false ;
        }

        return arr[index] == target || search(arr,target,index + 1);
    }

    static int search2(int[] arr, int target ,int index){
        if(index == arr.length ){
            return -1 ;
        }
        if(arr[index] == target){
            return index;
        }else{
             return search2(arr,target,index + 1);
        }

    }

    static int search3last(int[] arr, int target ,int index){
        if(index == -1 ){
            return -1 ;
        }
        if(arr[index] == target){
            return index;
        }else{
            return search3last(arr,target,index - 1);
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void search4all(int[] arr, int target ,int index){
        if(index == arr.length ){
            return  ;
        }
        if(arr[index] == target){
            list.add(index);
        }

        search4all(arr,target,index + 1);
    }

    static ArrayList<Integer> search4all2(int[] arr, int target ,int index, ArrayList<Integer> list){
        if(index == arr.length ){
            return list ;
        }
        if(arr[index] == target){
            list.add(index);
        }

        return search4all2(arr,target,index + 1,list);
    }

    static ArrayList<Integer> search5all2(int[] arr, int target ,int index){
         ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length ){
            return list ;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ans = search5all2(arr,target,index + 1);

        list.addAll(ans);

        return list;
    }
}
