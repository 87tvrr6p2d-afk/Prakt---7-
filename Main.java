public class Main {

    public static void main(String[] args) {

        Light light = new Light();

        ICommand lightOn = new LightOnCommand(light);
        ICommand lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.pressUndo();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
