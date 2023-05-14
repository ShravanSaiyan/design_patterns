package composite.examples.menu;

public class MenuItem extends MenuComponent {

    String name;
    String description;

    boolean vegetarian;
    int price;

    public MenuItem(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getDescription());
        System.out.println(getPrice());
        if(isVegetarian()) System.out.println("Veg");
    }
}
