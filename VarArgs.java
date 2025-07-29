import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
    // fun(2,45,6,4,6,34,6,5);
    multiple(2, 3, "sarthak", "lisha", "ruchi", "sanjiv");
  }
  static void multiple(int a , int b , String ...v){
    System.out.println();
  }
  static void fun(int ...v) {
    System.out.println(Arrays.toString(v));

  }
}
