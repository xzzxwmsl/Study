package generictype;

import java.util.Arrays;

// 实现可以使用Comparable的类
public class ComparableClass {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
            new Person("xzz",100),
            new Person("ALB", -3),
            new Person("TGZ", 30),
            new Person("HWD", 12)
        };

        Arrays.sort(persons);

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}

class Person implements Comparable<Person> {

    String name;
    int score;

    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name)*-1;
    }

    public String toString() {
        return this.name + "," + this.score;
    }
}