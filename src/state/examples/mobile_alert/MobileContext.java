package state.examples.mobile_alert;

public class MobileContext {
    private State state;

    public MobileContext() {
        state = new VibrationState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void alert() {
        state.alert();
    }
}
