import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(254);
//        list.add(784);
//        list.add(20);
//        list.add(434);
//        list.add(7878);
//
//       System.out.println(list.contains(434));//to check whether it contains or not
//
//        System.out.println(list);
//        list.set(0,43);//to change an index
//        list.remove(2);//to remove an index->784
//        System.out.println(list);
            //INPUT
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
            //TO GET AN ITEM
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
