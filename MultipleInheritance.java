interface ProgrammerCodes {
    void code();
}

interface ProgrammerDeploys {
    void deploy();
}

class Programmer1 implements ProgrammerCodes, ProgrammerDeploys {
    public void code() {
        System.out.println("Programmer is coding");
    }
    public void deploy() {
        System.out.println("Programmer is deploying");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Programmer1 p1 = new Programmer1();
        p1.code();
        p1.deploy();
    }

}
