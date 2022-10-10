package chapter_12_combined.mvc.model.heart;

import chapter_12_combined.mvc.view.BPMObserver;
import chapter_12_combined.mvc.view.BeatObserver;

public interface HeartModelInterface {

    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
