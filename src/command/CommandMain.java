package command;

public class CommandMain {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        TurnOn turnOn = new TurnOn(bulb);
        TurnOff turnOff = new TurnOff(bulb);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.submit(turnOn); // Bulb has been lit!
        remoteControl.submit(turnOff);// Darkness!
    }
}
