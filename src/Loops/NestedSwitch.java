package Loops;

import java.util.Scanner;

public class NestedSwitch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int EmpId = in.nextInt();
    String Department = in.next();


    switch (EmpId){
      case 1 :
      System.out.println("Sarthak kumar");
      break;
      case 2 :
      System.out.println("Lisha");
      break;
      case 3:
      System.out.println("Emp Number 3");
        switch (Department) {

          case "IT":
            System.out.println("IT department");
            break;
          
          case "Management":
          System.out.println("Management department");
          break;
          default:
          System.out.println("No department name eneterd");
            break;
        }
        break;
        default:
        System.out.println("Enter valid info");
    }
  }
  
}
