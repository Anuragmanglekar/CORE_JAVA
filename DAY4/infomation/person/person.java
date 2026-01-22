package infomation.person;

public class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
