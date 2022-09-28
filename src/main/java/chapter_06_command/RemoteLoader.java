package chapter_06_command;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.setCommand(1, stereoOn, stereoOff);

        System.out.println(remoteControl);

        System.out.println("\nLight ON/OFF/UNDO");
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        System.out.println("\nStereo ON/OFF/UNDO");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        Command[] lightAndStereoOn = { lightOn, stereoOn };
        Command[] lightAndStereoOff = { lightOff, stereoOff };

        MacroCommand lightAndStereoOnMacro = new MacroCommand(lightAndStereoOn);
        MacroCommand lightAndStereoOffMacro = new MacroCommand(lightAndStereoOff);

        remoteControl.setCommand(2, lightAndStereoOnMacro, lightAndStereoOffMacro);

        System.out.println("\nMacro ON");
        remoteControl.onButtonWasPushed(2);
        System.out.println("\nMacro OFF");
        remoteControl.offButtonWasPushed(2);
    }
}
