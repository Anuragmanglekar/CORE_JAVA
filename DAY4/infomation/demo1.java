package infomation;
import infomation.person.*;
import infomation.Employee.Employee;
import infomation.Student.*;

public class demo1 {
    public static void main(String[] args) {
        System.out.println("Person info -->");
        person p = new person("Anurag", 20);
        p.display();
        System.out.println("Student info -->");
        Student s = new Student(1, "Pradip");
        s.display();
        System.out.println("Employee info --->");
        Employee e = new Employee(2, 20000.0);
        e.display();

    }
    
}
