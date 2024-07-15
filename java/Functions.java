import java.util.Scanner;

public class Functions {

    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
            System.out.println("Hello Java");

            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            
            printMyName(name);
        }
}
