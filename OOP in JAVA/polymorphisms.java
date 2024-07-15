class Student{
    String name;
    int age;


    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}



public class polymorphisms {
    public static void main(String[] args) {
            System.out.println("Hello Java");


            Student s1 = new Student();
            s1.name = "Ankit anand";
            s1.age = 22;

            s1.printInfo(s1.name);
            
        }
}
