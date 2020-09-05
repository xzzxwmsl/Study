package chapter_13;

public abstract class AnimalAbstract {
    public abstract String howToEat();

    public String canHaveMethod(){
        return "抽象类可以有默认方法";
    }
}

class Chicken extends AnimalAbstract{
    @Override
    public String howToEat(){
        return "炸鸡";
    }
}

class Cow extends AnimalAbstract{
    @Override
    public String howToEat(){
        return "牛排";
    }

    @Override
    public String canHaveMethod(){
        return "改写了默认方法";
    }
}