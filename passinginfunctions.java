import java.util.Arrays;

public class passinginfunctions {
  public static void main(String[] args) {
    int[] num = {3 , 5, 5, 6, 6};
    System.out.println(Arrays.toString(num));
    
    change(num);
    System.out.println(Arrays.toString(num));
  }
  static void change(int[] arr){
    arr[0] = 99;
  }
}
