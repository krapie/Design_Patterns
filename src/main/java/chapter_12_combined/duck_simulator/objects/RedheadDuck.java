package chapter_12_combined.duck_simulator.objects;

import chapter_12_combined.duck_simulator.observer_iterator.Observable;
import chapter_12_combined.duck_simulator.observer_iterator.Observer;

public class RedheadDuck implements Quackable {

    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "붉은머리오리";
    }
}
