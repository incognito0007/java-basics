class Pen {
    String color;
    String type;


    public void write(){
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student() {
    //     System.out.println("constructor working");
    // }

    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }


    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }
}


public class ObjOrPro {
    public static void main(String[] args) {
            System.out.println("Hello Java");


            Pen pen1 = new Pen();
            pen1.color = "blue";
            pen1.type = "gel";


            pen1.write();

            Pen pen2 = new Pen();
            pen2.color = "red";
            pen2.type = "ballpoint";

            pen1.printColor();
            pen2.printColor();


            // Student s1 = new Student("ankit", 22);
            Student s1 = new Student();
            s1.name = "Ankit Anand";
            s1.age = 22;

            // Student s2 = new Student("sanu", 21);
            Student s2 = new Student(s1);
            // s2.name = "Sanskruti";
            // s2.age = 21;

            // s1.printInfo();
            s2.printInfo();
            
        }
}
