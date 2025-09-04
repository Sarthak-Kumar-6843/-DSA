package Questions;

import java.util.*;

public class P_shuffle {
    public static void main(String[] args) {
        Integer[] num = {1,2,4,5,6,7};

        List<Integer> list = Arrays.asList(num);//changes the array to list

        Collections.shuffle(list);

        System.out.println(Arrays.toString(num));

    }
}
