package chapter_01_strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
