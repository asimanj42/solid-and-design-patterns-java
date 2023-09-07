package az.example.designpatterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        ClientRemoteControl remoteControl = new ClientRemoteControl();
        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();
    }
}
