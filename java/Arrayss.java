
import java.util.Scanner;

public class Arrayss {
    public static void main(String[] args) {
            System.out.println("Hello Java");
            // int subjectMarks[] = new int[3];
            // subjectMarks[0] = 55;
            // subjectMarks[1] = 78;
            // subjectMarks[2] = 81;

            // int marks[] = {74, 75, 76};

            // Question --> Take an array as an input from the user. Search for a given number x and print the index at which it occurs.

            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();

            int marks[] = new int[size];

            // for(int i = 0; i < size; i++){
            //     marks[i] = sc.nextInt();
            // }

            for(int i = 0; i < size; i++){
                System.out.print(marks[i] + " ");
            }

            // int target = sc.nextInt();

            // for(int i = 0; i < size; i++){
            //     if (marks[i] == target) {
            //         System.out.println(i);
            //     }
            // }


        }
}
