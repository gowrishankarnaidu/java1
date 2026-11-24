
public class Employee {
    String name;
    double basesalary;

    void displayBasicInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + basesalary);
    }

    public static void main(String[] args) {

        Developer d = new Developer();

        d.name = "ramu";
        d.basesalary = 20000000;
        d.programmingLanguage = "java";

        System.out.println("Developer Details:");
        d.displayBasicInfo();
        d.writecode();

        Tester t = new Tester();

        t.name = "raju";
        t.basesalary = 30000;
        t.testingTool = "Selenium";

        System.out.println("\nTester Details:");
        t.displayBasicInfo();
        t.runTests();
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writecode() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Tester extends Employee {
    String testingTool;

    void runTests() {
        System.out.println("Testing Tool: " + testingTool);
    }
}
