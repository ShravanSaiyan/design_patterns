package iterator.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();

        // just a demo. We can add a new class that manages adding , deleting menu items
        menuItems.add(new MenuItem("egg", "An egg", 20));
        menuItems.add(new MenuItem("mojito", "An refreshing drink", 60));

        Iterator<MenuItem> menuItemIterator = menuItems.iterator();

        menuItemIterator.forEachRemaining(menuItem -> {
            System.out.println(menuItem.name());
            System.out.println(menuItem.description());
            System.out.println(menuItem.price());
        });
    }
}
