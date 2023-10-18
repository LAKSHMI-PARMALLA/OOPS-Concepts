class Employee {
    int bonus = 50000;
}

class Programmer extends Employee {
  int salary = 80000;
}
public class Inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Salary of the programmer: " + p.salary);
        System.out.println("Bonus of the programmer: " + p.bonus);
    }

}
