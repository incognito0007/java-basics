public class StringsBulder {
    public static void main(String[] args) {
            System.out.println("Hello Java");
            
            // <--------- All the functions are same as Strings ----->
            // <-------- String builder is mutable --------->

            StringBuilder sb = new StringBuilder("ANKIT ANAND");

            System.out.println(sb);

            sb.setCharAt(6, 'X');

            System.out.println(sb);

            sb.insert(6, 'A');
            System.out.println(sb);

            sb.delete(7, 8);
            System.out.println(sb);

            sb.append('d');
            System.out.println(sb);


        }
}
