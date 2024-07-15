public class firstLastOccString {

    public static int first = -1;
    public static int last = -1;

    public static void occurence(String str, int idx, char element){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);

            return;
        }

        char currentChar = str.charAt(idx);

        if(currentChar == element){
            if (first == -1) {
                first = idx;
            }else{
                last = idx;
            }
        }

        occurence(str, idx + 1, element);
    }



    public static void main(String[] args) {
            System.out.println("Hello Java");
            occurence("abaacdaefaah", 0, 'a');
        }
}