import javax.swing.*;
import java.util.Scanner;
import java.util.logging.Filter;

public class Main {


  public static void main(String[] args) {

    boolean addNewUser = true;

    //declaration of variables.
    while (addNewUser == true) {

      String name;
      int age;
      double amountInAccount;

      Scanner input = new Scanner(System.in); //create a Scanner Object

      System.out.println("Enter your name");
      name = input.next();
      System.out.println("Enter your age");
      age = input.nextInt();
      System.out.println("Enter amount in your account");
      amountInAccount = input.nextDouble();

      String withdraw;
      double withdrawAmount;
      System.out.println("Do you want to withdraw? if yes then write yes");
      String userAnswer = input.next();
      if (userAnswer.toLowerCase().equals("yes")) {
        System.out.println("How much amount you want to withdraw?");
        withdrawAmount = input.nextDouble();
        double ans = withdrawAmount - amountInAccount;
        System.out.println("" + name + "" + "withdraw amount" + "" + withdrawAmount + "" +"From" + "" + amountInAccount + ""+ "now balance is" + "" +ans);

      }

      String deposit;
      if (userAnswer.toLowerCase().equals("no")) {
        System.out.println("Do you want to deposit if yes then write yes");
        userAnswer = input.next();
        if (userAnswer.toLowerCase().equals("yes")) {
          System.out.println("How much amount you want to deposit");
          double depositAmount = input.nextDouble();
          double ans = depositAmount + amountInAccount;
          System.out.println("" + name + "" + "deposit amount" + "" + depositAmount + "" +"From" + "" + amountInAccount + ""+ "now balance is" + "" +ans);

        }

      }
      System.out.println("Do you want to exit then write yes");
      String answer = input.next();




      if (answer.toLowerCase().equals("yes"))
      {
        System.exit(0);
      }
    }



  }
}


