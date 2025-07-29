public class linearSearch {
    public static void main(String[] args) {
        int[] num = {1,3,4,5,2,3,5,2,42,4};
        int target = 422;

        System.out.println(linearsearch( num , target));

    }
    static int linearsearch(int[] num , int target ){
        if(num.length == 0){
            return -1;
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;

            }
        }

        return -1;
    }
}
