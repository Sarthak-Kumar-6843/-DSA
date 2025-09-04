package Questions;

public class P_goodpairs {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,3,4,5,6,4,5,6,5,7,8,7,8};
        int count = 0;
            //good pair we need i < j  it means which number are same in the index
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1 ; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    System.out.println("Good pair: (" + i + ", " + j + ")");

                }
            }
        } System.out.println(count);
    }
}
