package command.examples.cart;

public class AddToCartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Added the item to the cart");
    }

    @Override
    public void unExecute() {
        System.out.println("Removed the item to the cart");
    }
}
