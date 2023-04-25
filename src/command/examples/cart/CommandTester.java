package command.examples.cart;

public class CommandTester {
    public static void main(String[] args) {

        Invoker addToCardInvoker = new Invoker(new AddToCartCommand());
        Invoker paymentInvoker = new Invoker(new PaymentCommand());
        addToCardInvoker.executeCommand();
        paymentInvoker.unExecuteCommand();

    }
}
