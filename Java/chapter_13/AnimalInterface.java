package chapter_13;

public interface AnimalInterface {
    public String howToEat();
}

class Chicken2 implements AnimalInterface {
    @Override
    public String howToEat() {
        return "红烧鸡";
    }
}

class Cow2 implements AnimalInterface {
    @Override
    public String howToEat() {
        return "牛肉汉堡";
    }
}
