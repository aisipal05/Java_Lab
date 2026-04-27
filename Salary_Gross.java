
interface Gross {

    double calculateGross();
}

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Salary extends Employee implements Gross {

    double basic, hra, da;

    Salary(int id, String name, double basic, double hra, double da) {
        super(id, name);
        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }

    public double calculateGross() {
        return basic + hra + da;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println("Gross Salary = " + calculateGross());
    }
}

public class Salary_Gross {

    public static void main(String[] args) {
        Salary s = new Salary(4204, "Annie", 20000, 3000, 2000);
        s.display();
    }
}
