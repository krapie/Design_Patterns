package chapter_12_combined.mvc;

import chapter_12_combined.mvc.controller.dj.BeatController;
import chapter_12_combined.mvc.controller.dj.ControllerInterface;
import chapter_12_combined.mvc.model.dj.BeatModel;
import chapter_12_combined.mvc.model.dj.BeatModelInterface;

public class DJTestDrive {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controllerInterface = new BeatController(model);
    }
}
