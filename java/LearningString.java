public class LearningString {
    public static void main(String[] args) {

            // <----------- CONCATENATION ----------------->

            String firstName = "Ankit";
            String lastName = "Anand";
            String fullName = firstName + " " +  lastName;

            System.out.println(fullName);
            System.out.println(fullName.length());

            // CHAR AT

            // for(int i = 0; i < fullName.length(); i++){
            //     System.out.println(fullName.charAt(i));
            // }


            // <----------- Comapring two String ------------>

            if(firstName.compareTo(lastName) == 0){
                System.out.println("Strings are equal");
            }else {
                System.out.println("Strings are not equal");
            }

            //  <-------------- Sub-String --------->

            String name = fullName.substring(0, 6);
            System.out.println(name);

            // <----------- Strings are Immutable in JAVA --------->
           
            
        }
}
