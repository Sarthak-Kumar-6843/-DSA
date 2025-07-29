public class swap {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    //swap
    // int temp = a;
    // a=b;
    // b = temp;
    swap(a, b);

    System.out.println(a + " " + b);

    String name = "Sarthak";
    changeName(name);
    System.out.println(name);
  }
  static void changeName(String name){
    name = "Lisha";
  }


  static void swap(int a , int b){
        int temp = a;
        a=b;
        b = temp;
  }

}
