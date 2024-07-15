import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
            // System.out.println("Hello Java");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string : ");
            String str = sc.nextLine();

            StringBuilder strb = new StringBuilder(str);

            // for(int i = 0; i < strb.length()/2; i++){
            //     int first = i;
            //     int last = strb.length() - 1 - i;

            //     char frontChar = strb.charAt(first);
            //     char lastChar = strb.charAt(last);

            //     strb.setCharAt(first, lastChar);
            //     strb.setCharAt(last, frontChar);

            // }

            int f = 0;
            int l = strb.length() - 1;

            while (f < l) {
                char fisrtChar = strb.charAt(f);
                char lastChar = strb.charAt(l);

                strb.setCharAt(f, lastChar);
                strb.setCharAt(l, fisrtChar);

                f = f + 1;
                l = l - 1;
            }

            System.out.println(strb);
            
        }
}
