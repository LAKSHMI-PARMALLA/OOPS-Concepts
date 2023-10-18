abstract class Bank {
    abstract int getRateOfInterest();
}

class Hdfc extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 12;
    }
}

public class AbstractionExample {
   public static void main(String[] args) {
       Bank b;
       b = new Hdfc();
       System.out.println("Rate of Interest for HDFC is " + b.getRateOfInterest() + "%");
       b = new SBI();
       System.out.println("Rate of Interest for HDFC is " + b.getRateOfInterest() + "%");
   }

}
