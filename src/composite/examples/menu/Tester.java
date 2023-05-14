package composite.examples.menu;

public class Tester {
    public static void main(String[] args) {
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Dinner");
        MenuComponent desertMenu = new Menu("Desert Menu", "Desert");
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Breakfast");

        MenuComponent allMenus = new Menu("allMenus", "All Menus");

        allMenus.add(dinnerMenu);
        allMenus.add(desertMenu);
        allMenus.add(breakfastMenu);


        dinnerMenu.add(new MenuItem("Ghee Rice", "Awesome Ghee Rice", 120));
        desertMenu.add(new MenuItem("DBC", "Death By Chocolate", 220));


        new Waitress(allMenus).printMenu();
    }
}
