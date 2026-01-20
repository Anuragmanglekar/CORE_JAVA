import java.util.*;

class Employee {
    private String name;
    private int id;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void access() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:");
        name = sc.next();
        System.out.print("Id:");
        id = sc.nextInt();
        System.out.print("Salary:");
        salary = sc.nextDouble();

    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Id:" + id);
        System.out.println("Salary:" + salary);
    }
}

public class demo3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.access();
        e.display();

        e.setSalary(1222); // access setter and getter method
        System.out.println("Salary :" + e.getSalary());

    }
}
