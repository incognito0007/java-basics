// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class QuestionThree {

    public static void greaterOfTwo(int a, int b){
        if (a > b) {
            System.out.println("a is greater than b");
        }else if (a < b) {
            System.out.println("b is greater than a");
        }else{
            System.out.println("a and b are equal");
        }
    }
    public static void main(String[] args) {
            System.out.println("Hello Java");

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            greaterOfTwo(a, b);
            
        }
}
