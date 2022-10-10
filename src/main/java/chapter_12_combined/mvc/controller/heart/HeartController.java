package chapter_12_combined.mvc.controller.heart;

import chapter_12_combined.mvc.controller.dj.ControllerInterface;
import chapter_12_combined.mvc.model.heart.HeartAdapter;
import chapter_12_combined.mvc.model.heart.HeartModelInterface;
import chapter_12_combined.mvc.view.DJView;

public class HeartController implements ControllerInterface {

    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(new HeartAdapter(model), this);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {}

    @Override
    public void stop() {}

    @Override
    public void increaseBPM() {}

    @Override
    public void decreaseBPM() {}

    @Override
    public void setBPM(int bpm) {}
}
