//Runtime Polymorphism(Overriding)
class EngineeringTeam {
    public void role() {
        System.out.println("Get quality work done");
    }
}

class Manager extends EngineeringTeam {
    public void role() {
        System.out.println("Manager manages the team");
    }
}
class Developer2 extends EngineeringTeam {
    public void role() {
        System.out.println("Developer develops the code");
    }
}
class AutomationEngineer extends EngineeringTeam {
    public void role() {
        System.out.println("Automates testing process");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        EngineeringTeam et = new EngineeringTeam();
        Manager m = new Manager();
        Developer2 d = new Developer2();
        AutomationEngineer e = new AutomationEngineer();
        et.role();
        m.role();
        d.role();
        e.role();
    }
}
