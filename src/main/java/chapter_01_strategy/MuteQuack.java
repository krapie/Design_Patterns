package chapter_01_strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
