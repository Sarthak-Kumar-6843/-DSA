import java.util.Scanner;

public class CaseCheck {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char ch = in.next().trim().charAt(0);
    //trim()use to remove extra spaces from the string
    //charAt is use to print the index of the string
    System.out.println(ch);

    if(ch >= 'a' && ch <= 'z'){
      System.out.println("lowercase");
    }else{
      System.out.println("uppercase");
    }
  }
}
