package infomation.Employee;

public class Employee {
    private int id;
    private Double Salary;

    public Employee(int id, Double salary) {
        this.id = id;
        this.Salary = salary;
    }

    public void display()
    {
        System.out.println("id:"+id);
        System.out.println("Salary:"+this.Salary);
    }
}
