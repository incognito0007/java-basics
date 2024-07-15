import java.util.*;


public class If_else {
    public static void main(String[] args) {
            System.out.println("enter your age : ");

            Scanner sc = new Scanner(System.in);

            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult and your age is " + age);
            }else{
                System.out.println("you are not and adult as your age is " + age);
            }
            
        }
}
