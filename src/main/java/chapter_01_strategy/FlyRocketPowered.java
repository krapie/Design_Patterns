package chapter_01_strategy;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("로켓 추친으로 날아갑니다");
    }
}
