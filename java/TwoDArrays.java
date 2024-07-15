
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
            System.out.println("Hello Java");

            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int col = sc.nextInt();

            int numbers[][] = new int[rows][col];

            // INPUT
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < col; j++){
                    numbers[i][j] = sc.nextInt();
                }
            }

            // OUTPUT
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < col; j++){
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }

            // LINEAR SEARCH

            int x = sc.nextInt();

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < col; j++){
                    if(numbers[i][j] == x){
                        System.out.println("row = " + i + " and column = " + j);
                    }
                }
            }
            
        }
}
