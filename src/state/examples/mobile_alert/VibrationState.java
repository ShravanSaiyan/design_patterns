package state.examples.mobile_alert;

public class VibrationState implements State {
    @Override
    public void alert() {
        System.out.println("Vibration Mode");
    }
}
