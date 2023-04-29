package facade.home_theatre;

public class Tester {

    public static void main(String[] args) {
        HomeTheater homeTheater = new HomeTheater(new TV(), new Radio());
        homeTheater.initiateTheatreMode();
        homeTheater.endTheatreMode();
    }
}
