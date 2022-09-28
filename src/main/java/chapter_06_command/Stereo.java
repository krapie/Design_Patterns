package chapter_06_command;

public class Stereo {
    int volume;

    public void on() {
        System.out.println("Stereo On");
    }

    public void off() {
        System.out.println("Stereo Off");
    }

    public void setCD() {
        System.out.println("Stereo Set CD");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo Set Volume: " + volume);
    }

    public int getVolume() {
        return volume;
    }
}
