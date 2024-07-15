
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
            System.out.println("Hello User! Welcome \nHere is the calculator");

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String ex = sc.nextLine();

            switch (ex) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("invalid expression");
                    break;
            }

        }
}
