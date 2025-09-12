package Recursion;

/*
 * 2 or more functions of same name but with different arguments
 */
public class overloading {
  public static void main(String[] args) {
    fun(67);
    // fun("sarthak");
  }
  static void fun(int a){
    System.out.println("first one");
    System.out.println(a);
  }
  static void fun(String name){
    System.out.println("second one");
    System.out.println(name);
  }
}
