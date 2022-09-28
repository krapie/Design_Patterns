package chapter_06_command;

public class StereoOffWithCDCommand implements Command {
    Stereo stereo;
    int volume;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        volume = stereo.getVolume();
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(volume);
    }
}
