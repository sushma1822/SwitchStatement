import java.util.Scanner;

public class Calculation {
       int number;
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("please enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("please enter an operator ( +, -, *, /, % :");
        char operator = scanner.next().charAt(0);

        switch (operator){
            case '+':
               System.out.println(number1 +" +" +number2+ "=" + (number1+number2));
                break;
            case '-':
                System.out.println(number1 +" - " +number2+ "=" + (number1-number2));
                break;
            case '*':
             System.out.println(number1 +" * " +number2+ "=" + (number1*number2));
                break;
            case '/':
            System.out.println(number1+ "/" +number2+ "=" +(number1/number2));
                break;
            case '%':
            System.out.println(number1+ "%" + number2+ "=" +(number1%number2));
                break;
            default : System.out.println("error! operator is not correct");

            return;


        }

        }

    }

