package chapter_12_combined.duck_simulator.factory;

import chapter_12_combined.duck_simulator.objects.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
