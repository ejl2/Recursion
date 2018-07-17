import java.util.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      //set scanner to read from command line
      Scanner in = new Scanner(System.in);

      while (true) {
        try {
          System.out.println("Enter an integer to factorialize");
          String input = in.next();

          // ends the program if "end" is entered
          if (input.equals("end")) {
            break;
          }

          //finds factorial of input
          Long num = Long.parseLong(input);
          System.out.println(factorial(num));

        } catch (Exception ex) {
          System.out.println("Invalid input. Please enter an integer");
        }
      }
  }

  /* pre: num is non negative integer, > 0
  * post: returns the factorial of the integer given
  */
  public static Long factorial(Long num) {

    if (num - 1 == 0) {
      return num;
    }

    return num*factorial(num-1);
  }

}
