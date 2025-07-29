public class shadowing {
  static int x = 90;//shadowed at line 5
  public static void main(String[] args) {
    System.out.println(x);//print 90
    int x ;
    //System.out.println(x);//scope will begin only when it is initialized
     x = 40;
    System.out.println(x);//print 40
    fun();
  }
  static void fun(){
    System.out.println(x);
  }
}
