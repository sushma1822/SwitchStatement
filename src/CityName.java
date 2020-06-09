import java.util.Scanner;

public class CityName {
    public static void main(String[] arg){
      char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet:");
        ch = scanner.next().charAt(0);
        switch (ch){
            case ('a'):
                System.out.println("Alston");
             break;
            case ('b'):
                System.out.println("Birmingham");
              break;
            case ('c'):
                System.out.println("Coventry");
              break;
            case ('d'):
                System.out.println("Dundee");
              break;
            case ('e'):
                System.out.println("Edinburgh");
              break;
            case ('f'):
               System.out.println("Fair view");
              break;
            default:
                System.out.println("Invalid entry");
                break;

        }

    }
}
