// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class QuestionTwo {

    public static int sumOddNumbers(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
            System.out.println("Hello Java");
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int sum = sumOddNumbers(n);

            System.out.println("sum of the odd numbers between 1 and " + n + " is " + sum);
        }
}
