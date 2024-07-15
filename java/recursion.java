public class recursion {

    public static void printNToOne(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        printNToOne(n-1);
    }

    public static int sumNaturalNumber(int n){
        if(n == 0){
            return 0;
        }

        int sum = n + sumNaturalNumber(n-1);
        return sum;
    }    

    public static int factorial(int n){
        int fact = 1;
        if (n == 0) {
            return 1;
        }

        fact = n * factorial(n-1);
        return fact;
    }

    public static int fibonacci(int n){
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        
        int ans = fibonacci(n - 1) + fibonacci(n - 2);
        return ans;
        
    }

    public static int xRaiseToPowerN(int x, int n){

        int ans = 1;
        if(n == 0){
            return 1;
        }

        ans = x * xRaiseToPowerN(x, n-1);
        return ans;
    }

    public static void main(String[] args) {
            System.out.println("Hello Java");
            
            int n = 5;

            printNToOne(n);
            System.out.println();
            System.out.println(sumNaturalNumber(n));
            System.out.println(factorial(n));
            System.out.println(fibonacci(10));
            System.out.println(xRaiseToPowerN(n, 3));
        }
}
