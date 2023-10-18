class People {
    private int age;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        }
}
public class Encapsulation {
    public static void main(String[] args) {
        People p = new People();
        p.setName("LAKSHMI");
        p.setAge(24);
        System.out.println("Name: " +p.getName());
        System.out.println("Age: " +p.getAge());
    }
}
