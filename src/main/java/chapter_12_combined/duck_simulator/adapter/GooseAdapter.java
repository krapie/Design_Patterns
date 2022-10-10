package chapter_12_combined.duck_simulator.adapter;

import chapter_12_combined.duck_simulator.objects.Goose;
import chapter_12_combined.duck_simulator.objects.Quackable;
import chapter_12_combined.duck_simulator.observer_iterator.Observable;
import chapter_12_combined.duck_simulator.observer_iterator.Observer;

public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return goose.toString();
    }
}
