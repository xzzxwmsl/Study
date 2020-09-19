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
}

class Student extends People {
    public String classroom;
    private String grade;
    int money;
    protected String next;

    Student(String s) {
        super(s);
    }

    private String getClassroom(){
        return classroom;
    }

    public int getMoney(String type){
        return money;
    }

    public String getGrade(String type){
        return grade;
    }

    private String privateMethod(){
        return "call this privateMethod";
    }
}