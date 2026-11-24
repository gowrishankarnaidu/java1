
class Person {
    String name;
}
class Employee extends Person {
    String employeeId;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}
public class Manager extends Employee {
    String department;
    void displayManager() {
        System.out.println("Department: " + department);
    }
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "John";
        m.employeeId = "E123";
        m.department = "Sales";
        System.out.println("Name: " + m.name);
        m.displayEmployee();
        m.displayManager();
    }
}
