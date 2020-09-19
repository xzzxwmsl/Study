package reflection;

public class People {
    public String name;
    protected int age;
    String sex;
    private String country;

    People(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry(){
        return country;
    }

    People(){
        name="null";
    }
}

class Student extends People {
    public String classroom;
    private String grade;
    int money;
    protected String next;

    public Student(String s) {
        super(s);
    }

    public Student(){
        super("xzz");
    }

    Student(String name, int money) {
        setName(name);
        this.money = money;
    }

    private String getClassroom() {
        return classroom;
    }

    public int getMoney(String type) {
        return money;
    }

    public String getGrade(String type) {
        return grade;
    }

    private String privateMethod() {
        return "call this privateMethod";
    }

    @Override
    public String toString() {
        return "Name:"+getName()+", Money:"+money;
    }
}