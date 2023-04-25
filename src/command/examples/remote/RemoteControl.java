package command.examples.remote;

public class RemoteControl {
    Command slot;

    public void setCommand(Command cmd) {
        slot = cmd;
    }


    public void pressButton() {
        slot.execute();
    }
}
