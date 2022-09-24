package chapter_01_strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MullardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
