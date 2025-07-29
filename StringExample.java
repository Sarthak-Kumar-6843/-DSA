import java.util.Scanner;

public class StringExample {
  public static void main(String[] args) {
    // String message = greet();
    // System.out.println(message);
    Scanner in = new Scanner(System.in);
    System.out.print("enter your name : ");
    String name = in.next();
    String hello = greet(name);
    System.out.println(hello);

  }
  static String greet(String name){
    String message = "hello " + name;
    return message;
  }

  // static String greets (){
  //   String greeting = "how are you ?";
  //   return greeting;
  // }
}
