package chapter_11;

public class TestSuper {
    public static void main(String[] args) {
        // TestFather testFather = new TestFather(7);
        TestSon testSon1 = new TestSon();
        TestSon testSon2 = new TestSon(8);
        TestSon testSon3 = new TestSon(1, 2);
        System.out.printf("i = %d, j = %d\n", testSon1.i, testSon1.j);
        System.out.printf("i = %d, j = %d\n", testSon2.i, testSon2.j);
        System.out.printf("i = %d, j = %d\n", testSon3.i, testSon3.j);
        System.out.println("-------------------------------");
        // 解释见Note
        Faculty faculty = new Faculty();
    }
}

class TestFather {
    int i;

    TestFather() {
        i = -1;
    }

    TestFather(int i) {
        this.i = i;
    }
}

class TestSon extends TestFather {
    int j;

    TestSon() {
        // 将自动调用super()
        j = 10;
    }

    TestSon(int j) {
        super(7); // i = 7
        this.j = j;
    }

    TestSon(int i, int j) {
        // 将自动调用super()
        this.j = i + j;
    }
}

// Person => Employee => Faculty
class Person{
    Person(){
        System.out.println("(1)");
    }
}

class Employee extends Person{
    Employee(){
        this("(2)");
        System.out.println("(3)");
    }
    Employee(String s){
        System.out.println(s);
    }
}

class Faculty extends Employee{
    Faculty(){
        System.out.println("(4)");
    }
}