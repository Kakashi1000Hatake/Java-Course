import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = sc.nextInt();

        System.out.println("Enter Second Number :");
        int b = sc.nextInt();

        System.out.println("Enter the operation :");
        String op = sc.next();

        switch (op) {
            case ("+") : System.out.println(a + b);
            break;

            case ("-") : System.out.println(a - b);
            break;

            case ("*") : System.out.println(a * b);
            break;

            case ("/") : System.out.println(a / b);
            break;

            case ("%") : System.out.println(a % b);
            break;

            default : System.out.println("Enter a valid Opereator");
        }


        sc.close();
    }
}
