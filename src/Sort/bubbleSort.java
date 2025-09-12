package Sort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));;

    }
    static void sort(int[] arr){
        boolean swapped;
        //run it n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step , max item will come at last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
        }
        }
    }
}

