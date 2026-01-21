import java.util.*;

//Step1: Understand requirement and Declare the class
class Date {

    // concrete class
    // Step2: Declare the fields
    // Step4: access modifiers

    private int day;
    private int month;
    private int year;

    public void initDate() {
        Calendar c = Calendar.getInstance();
        day = c.get(Calendar.DATE);
        month = c.get(Calendar.MONTH) + 1;
        year = c.get(Calendar.YEAR);

    }

    public void acceptrecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day:");
        day = sc.nextInt();
        System.out.print("Month:");
        month = sc.nextInt();
        System.out.print("Year:");
        year = sc.nextInt();

    }

    // this = d
    public void printrecord() {
        System.out.println("Day:" + this.day);
        System.out.println("Month:" + this.month);
        System.out.println("Year:" + this.year);

    }
}

public class demo1 {
    public static void main(String[] args) {
        // Step3: Creating the instance
        Date d = new Date();// instance ( instantiation)

        // Step5: calling methods
        d.initDate();
        d.printrecord();// d.printRecord(d);
        d.acceptrecord(); // message passing
        d.printrecord(); // d.printRecord(d);
        d.initDate();
        d.printrecord();

    }
}
