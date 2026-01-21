class person {
    private String name;
    private int age;

    public person() {
        this("Aditya", 31); // constructor chaining
    }

    public person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void printRecord() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

}

public class demo4 {
    public static void main(String[] args) {

        System.out.println("parameterless constructor");

        person p = new person();
        p.printRecord();

        System.out.println("parameterized constructor");

        person p1 = new person("Sham", 20);
        p1.printRecord();
    }
}
