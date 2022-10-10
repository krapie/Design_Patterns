package chapter_12_combined.duck_simulator.objects;

import chapter_12_combined.duck_simulator.observer_iterator.QuackObservable;

public interface Quackable extends QuackObservable {

    public void quack();
}
