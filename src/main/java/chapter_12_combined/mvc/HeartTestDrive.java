package chapter_12_combined.mvc;

import chapter_12_combined.mvc.controller.dj.ControllerInterface;
import chapter_12_combined.mvc.controller.heart.HeartController;
import chapter_12_combined.mvc.model.heart.HeartModel;

public class HeartTestDrive {

    public static void main(String[] args) {
        HeartModel model = new HeartModel();
        ControllerInterface controllerInterface = new HeartController(model);
    }
}
