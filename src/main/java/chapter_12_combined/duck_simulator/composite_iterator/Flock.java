package chapter_12_combined.duck_simulator.composite_iterator;

import chapter_12_combined.duck_simulator.objects.Quackable;
import chapter_12_combined.duck_simulator.observer_iterator.Observer;
import chapter_12_combined.duck_simulator.observer_iterator.QuackObservable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {

    List<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        quackers.forEach(quackable -> quackable.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {
        quackers.forEach(QuackObservable::notifyObservers);
    }
}
