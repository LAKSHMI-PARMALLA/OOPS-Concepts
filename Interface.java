interface Person {
    void display();
}
class Student implements Person {
    public void display() {
        System.out.println("I am a student");
    }
}
class Developer implements Person {
    public void display() {
        System.out.println("I am a Developer");
    }
}
public class Interface {
    public static void main(String[] args) {
        Person p;
        p = new Student();
        p.display();
        p = new Developer();
        p.display();
    }
}
