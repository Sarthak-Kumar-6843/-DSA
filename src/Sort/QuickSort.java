package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,7,8,12,43,54};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] num, int lo, int hi){
        if (lo >= hi){
            return;
        }

        int s = lo;
        int e = hi;
        int m = s + (e - s) / 2;

        int pivot = num[m];


        //if the arr is alr sorted we will not swap
        while (s <= e){
            while (num[s] < pivot){
                s++;
            }
            while (num[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = num[s];
                num[s] = num[e];
                num[e] = temp;
                s++;
                e--;
            }
        }

        //pivot at correct index now we sort 2 halves now
        sort(num,lo,e);
        sort(num,s,hi);
    }
}
