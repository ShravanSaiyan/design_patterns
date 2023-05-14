package composite.examples.menu;

public class Waitress {
    MenuComponent menu;

    public Waitress(MenuComponent menu) {
        this.menu = menu;
    }

    public void printMenu() {
        menu.print();
    }
}
