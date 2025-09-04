package Questions;

public class scope {

  /*
   * anything that is initialized outside the block can be used inside the block
   * but anything that is initialized inside the block can't be used outside.
   */
  public static void main(String[] args) {
   int a = 10;
   int b = 40;
    //block Questions.scope
    {
      // int a = 80; //alr initialized outside the block 
      a = 100;// reassign the value of a
      int c = 99;//a is alr initialized so it won't work
      // values initialized in this block will remain in this block
    }
    System.out.println(a);
    // System.out.println(c);//c can't be used outside the block


    //scoping in for loop
    for(int i = 0 ; i < 4 ; i++){
      System.out.println(i);
      int num = 100;
      // int a =100;//alr initialzed
    }
    // System.out.println(i);//can't use outside for loop


  }
  static void random(int marks){
    int num = 67;
    System.out.println(num);
    System.out.println(marks);
    //this will only execute in this function only.
  }
}
