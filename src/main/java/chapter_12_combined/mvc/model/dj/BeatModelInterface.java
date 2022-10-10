package chapter_12_combined.mvc.model.dj;

import chapter_12_combined.mvc.view.BPMObserver;
import chapter_12_combined.mvc.view.BeatObserver;

public interface BeatModelInterface {

    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();

    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
