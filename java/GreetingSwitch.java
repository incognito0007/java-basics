import java.util.*;

public class GreetingSwitch {
    public static void main(String[] args) {
            System.out.println("Hello Java");

            Scanner sc = new Scanner(System.in);

            int button = sc.nextInt();

            switch (button) {
                case 1:
                    System.out.println("Namastey");
                    break;
                case 2:
                    System.out.println("Hello");
                    break;
                case 3:
                    System.out.println("Bonjour");
                    break;    
                default:
                    System.out.println("invalid button");
                    break;
            }
            
        }
}
