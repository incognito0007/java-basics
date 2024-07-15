public class bitManipulation {
    public static void main(String[] args) {
            System.out.println("Hello Java");


            // GET BIT
            // get the 3rd bit(position 2) of a number n. (n = 0101)
            // bit mask: 1<<i
            // operation: AND

            // int n = 5;
            // int pos = 2;

            // int bitMask = 1 << pos;

            // if((bitMask & n) == 0){
            //     System.out.println("0");
            // }else{
            //     System.out.println("1");
            // }



            // SET BIT
            // Set the 2nd bit (position = 1) of a number n. (n = 0101)
            // bit mask : 1<<i
            // operation : OR

            // int n = 5;
            // int pos = 1;

            // int bitMask = 1 << pos;

            // int newNumber = bitMask | n;
            // System.out.println(newNumber);



            // CLEAR BIT
            // Clear the 3rd bit (position = 2) of a number n.(n = 0101)
            // bit mask 1<<i
            // operation: AND with NOT (take the not of bitmask and do the AND with n)

            // int n = 5;
            // int pos = 2;

            // int bitMask = 1<<pos;

            // int newNumber = (~(bitMask) & n);
            // System.out.println(newNumber);


            // UPDATE BIT
            // update the 2nd bit(position = 1) of a number n to 1. (n = 0101)

            // for 0:
            // bit mask: 1<<i
            // operation : AND with NOT

            // for 1:
            // bit mask = 1<<i
            // operation: OR

            

        }
}
