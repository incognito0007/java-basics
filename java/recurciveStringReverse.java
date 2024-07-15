public class recurciveStringReverse {

    public static void reverseString(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }


    public static void main(String[] args) {
            System.out.println("Hello Java");
            String str = "Ankit Anand";
            reverseString(str, str.length()-1);
        }
}
