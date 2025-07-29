import java.util.Scanner;

public class typeconversion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // float num = input.nextFloat();
    // System.out.println(num);

    //type casting
    // int num = (int)(67.56f);
    // System.out.println(num);


    // automatic type promotion in expressions
    // int a = 257;
    // byte b = (byte)(a);// 257%256 = 1
      // max value of byte is 256\





    //   byte a = 40;
    //   byte b = 50;
    //   byte c = 100; 
    //   //a*b is performed by taking them as integers as byte value max is 256 so java automatically upgrades it.
    //   int d = (a*b) / c ;

    // System.out.println(d);


    // System.out.println("नमस्ते");
    //java is unicode language so it can ezily print any language


    //Rule of type promotion

    // System.out.println(3*5.67);
    // one is integer and other is float so whole process is changed to float




    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = 0.1234;
    double result = (f*b) + (i / c) - (d*s);
    // float + int - double = double
    System.out.println((f*b) +" "+ (i / c) + " "  + (d*s));
    System.out.println(result);

    
  }
  
}
