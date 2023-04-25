package command.examples.cart;

public class Invoker {
    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public void unExecuteCommand() {
        command.unExecute();
    }
}
