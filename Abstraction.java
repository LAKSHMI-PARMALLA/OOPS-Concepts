abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Draw Circle");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        Shape a = new Circle();
        s.draw();
        a.draw();
    }
}