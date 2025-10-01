package interfacedemo;

interface Registerable {
}

class Student implements registerable {
    int id;
    String name;
    double fees;
    String course;

    public Student(int id, String name, double fees, String course) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.course = course;
    }
}

public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        registerable s = new Student(102, "Neha", 12000.3, "Java");
       
        if (s instanceof registerable) {
            System.out.println("Student is registered for this course");
        } else {
            System.out.println("Student is not registered for this course");
        }
    }
}
