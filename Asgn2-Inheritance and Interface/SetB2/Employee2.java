package SetB2;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Developer extends Employee {
    String projectName;

    public Developer(String name, double salary, String projectName) {
        super(name, salary);
        this.projectName = projectName;
    }

    public void display() {
        super.display();
        System.out.println("Project Name: " + projectName);
    }
}

class Programmer extends Developer {
    String progLanguage;

    public Programmer(String name, double salary, String projectName, String progLanguage) {
        super(name, salary, projectName);
        this.progLanguage = progLanguage;
    }

    public void display() {
        super.display();
        System.out.println("Programming Language: " + progLanguage);
    }
}

public class Employee2 {
    public static void main(String[] args) {
        Developer dev = new Developer("Aishu", 75000, "Golden Roots");
        dev.display();
    }
}
