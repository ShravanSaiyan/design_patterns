package state.examples.mobile_alert;

public class SilentState implements State {
    @Override
    public void alert() {
        System.out.println("Silent Mode");
    }
}
