import java.util.Scanner;

public class Factorial {

    public static int printFactorial(int a){
        int fac = 1;
        if(a < 0){
            return -1;
        }
        if(a == 0) return fac;

        fac = a * printFactorial(a - 1);
        
        // for(int i = a; i >= 1; i--){
        //     fac = fac * i;
        // }

        return fac;
    }
    public static void main(String[] args) {
            System.out.println("Hello Java");
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();

            int factorial = printFactorial(a);


            System.out.println("factorial of "+a+" is " + factorial);
        }
}
