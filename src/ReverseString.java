import java.util.Scanner;

public class ReverseString {
    public static void main(String[] arg){
        System.out.println("Enter string to reverse:");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reverse = "";

       // using condition in for loop
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}
