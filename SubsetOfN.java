import java.util.ArrayList;

public class SubsetOfN {

    public static void PrintSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+ " ");
        }
        System.out.println();
    }


    public static void FIndSubset(int n, ArrayList<Integer> subset){
        if(n == 0){
            PrintSubset(subset);
            return;
        }

        //add
        subset.add(n);
        FIndSubset(n-1,subset);

        //remove

        subset.remove(subset.size() - 1);
        FIndSubset(n-1,subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        FIndSubset(n,subset);

    }

}
