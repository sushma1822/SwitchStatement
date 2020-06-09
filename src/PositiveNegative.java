import java.util.Scanner;

public class PositiveNegative {
    public static int positive(int number){
        if (number>0){
            return 1;
        }
        else if (number<0){
            return 0;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int number = scanner.nextInt();
    int caseID = positive(number);
      switch (caseID){
          case 0 :
              System.out.println("Number is negative");
            break;
          case 1 :
              System.out.println("Number is positive");
            break;
          default :
              System.out.println("Number i zero");
      }

        }
    }


