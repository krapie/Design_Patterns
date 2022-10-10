package chapter_12_combined.duck_simulator.observer_iterator;


public interface QuackObservable {

    public void registerObserver(Observer observer);
    public void notifyObservers();
}
