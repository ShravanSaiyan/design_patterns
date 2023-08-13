package state.examples.mobile_alert;

public class Tester {
    public static void main(String[] args) {
        MobileContext mobileContext= new MobileContext();
        mobileContext.alert();
        mobileContext.setState(new SilentState());
        mobileContext.alert();
    }
}
