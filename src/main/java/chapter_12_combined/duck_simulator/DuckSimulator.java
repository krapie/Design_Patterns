package chapter_12_combined.duck_simulator;

import chapter_12_combined.duck_simulator.adapter.GooseAdapter;
import chapter_12_combined.duck_simulator.composite_iterator.Flock;
import chapter_12_combined.duck_simulator.decorator.QuackCounter;
import chapter_12_combined.duck_simulator.factory.AbstractDuckFactory;
import chapter_12_combined.duck_simulator.factory.CountingDuckFactory;
import chapter_12_combined.duck_simulator.objects.*;
import chapter_12_combined.duck_simulator.observer_iterator.Quackologist;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n오리 시뮬레이션 게임: 무리 (+컴포지트)");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임 (+옵저버)");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("\n오리 시뮬레이션 게임: 전체 무리");
        simulate(flockOfDucks);

        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
