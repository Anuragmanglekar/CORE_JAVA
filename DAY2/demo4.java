import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}

public class demo4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setName("Anurag");
        System.out.println("Name: " + e1.getName());

        e1.setId(12);
        System.out.println("ID: " + e1.getId());

        e1.setSalary(1222.0);
        System.out.println("Salary: " + e1.getSalary());
    }
}
