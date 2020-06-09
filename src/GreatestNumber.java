import java.util.Scanner;

public class GreatestNumber {
    int A,B,C;
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number A,B and C:");
      int A = scanner.nextInt();
      int B = scanner.nextInt();
      int C = scanner.nextInt();
       
         if (A >= B && A >= C ){
             System.out.println("A is the  largest number");
         }
         if (B >= A && B >= C){
              System.out.println(" B is the largest number");
         }
         if(C>=A && C >= B) {
             System.out.println(" C  is the largest number");

         }

    }
}
