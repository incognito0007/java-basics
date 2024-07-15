// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
            System.out.println("Hello Java");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the total count of the number you want to take as input");
            int n = sc.nextInt();

            int cntPos = 0;
            int cntNeg = 0;
            int cntZero = 0;

            for(int i = 1; i <= n; i++){
                int a = sc.nextInt();
                if(a > 0){
                    cntPos = cntPos + 1;
                }else if (a < 0) {
                    cntNeg = cntNeg + 1;
                }else{
                    cntZero = cntZero + 1;
                }
            }

            System.out.println("count of positive numbers are : " + cntPos);
            System.out.println("count of negative numbers are : " + cntNeg);
            System.out.println("count of Zeros are : " + cntZero);
        }
}
