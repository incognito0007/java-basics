// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class FunctionAverage {

    public static int printAverage(int a, int b, int c){
        int avg = (a + b + c)/3;
        return avg;
    }
    public static void main(String[] args) {
            System.out.println("Hello Java");
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int avg = printAverage(a, b, c);

            System.out.println("Average = "+ avg);
        }
}
