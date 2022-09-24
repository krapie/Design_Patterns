package chapter_01_strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
