//Method-Overloading
class Calculator {
    public int add(int a,int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
       return a + b +c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int sum1 = c.add(1,2);
        System.out.println(sum1);
        int sum2 = c.add(1,2,3);
        System.out.println(sum2);
        double sum3 = c.add(1.23, 2.34);
        System.out.println(sum3);
    }
}
