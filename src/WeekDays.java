import java.util.Scanner;

public class WeekDays {
    public static void main(String[] arg){
        int week;
        Scanner scanner = new Scanner(System.in);
        //input week number from user
        System.out.println("Enter any week  number (1-7): ");
        week = scanner.nextInt();
        switch (week){
            case 1 :
                System.out.println("sunday");
            break;
            case 2 :
                System.out.println("Monday");
             break;
            case 3 :
                System.out.println("Tuesday");
             break;
            case 4 :
                System.out.println("Wednesday");
             break;
            case 5 :
                System.out.println("Thursday");
             break;
            case 6 :
                System.out.println("Friday");
             break;
            case 7 :
                System.out.println("Saturday");
             break;
            default :
                System.out.println("Invalid Choice! Please enter week number");
        }
    }
}
