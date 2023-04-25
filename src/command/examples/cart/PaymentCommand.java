package command.examples.cart;

public class PaymentCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Payment initiated");
    }

    @Override
    public void unExecute() {
        System.out.println("Payment reverted");
    }
}
