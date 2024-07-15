// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.Scanner;

public class QuestionEight {

    public static int printXtoThePowerN(int x, int n){
        int value = 1;
        for(int i = 1; i <=n; i++){
            value = value * x;
        }
        return value;
    }
    public static void main(String[] args) {
            System.out.println("Hello Java");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(printXtoThePowerN(x, n));
        }
}
