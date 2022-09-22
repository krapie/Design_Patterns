package chapter_01;

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
