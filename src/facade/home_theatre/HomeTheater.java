package facade.home_theatre;

public class HomeTheater {
    TV tv;
    Radio radio;

    public HomeTheater(TV tv, Radio radio) {
        this.tv = tv;
        this.radio = radio;
    }

    public void initiateTheatreMode() {
        tv.on();
        radio.on();
    }

    public void endTheatreMode() {
        tv.off();
        radio.off();
    }

}
