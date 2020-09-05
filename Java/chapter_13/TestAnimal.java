package chapter_13;

public class TestAnimal {
    public static void main(String[] args) {
        AnimalAbstract chicken = new Chicken();
        AnimalAbstract cow = new Cow();

        AnimalInterface chicken2 = new Chicken2();
        AnimalInterface cow2 = new Cow2();

        System.out.printf("鸡 : %s, 牛 : %s\n", chicken.howToEat(),cow.howToEat());
        System.out.printf("抽象类可以有默认实现的方法 ：鸡 : %s, 牛 : %s\n",chicken.canHaveMethod(),cow.canHaveMethod());
        System.out.printf("鸡 : %s, 牛 : %s", chicken2.howToEat(),cow2.howToEat());
    }
}
