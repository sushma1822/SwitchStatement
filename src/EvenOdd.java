import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] arg){
        int number;
        Scanner scanner = new Scanner(System.in);
        // Input a number from user
        System.out.println("Enter any number to check even or odd: ");
        int num = scanner.nextInt();
        switch (num % 2){
            case 0:
            System.out.println("number is even");
            break;
            case 1:
             System.out.println("number is odd");
             break;

        }
    }

}
