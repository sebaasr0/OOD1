package assigment1.a1;

public class MenuItem {
    private String name;
    private double price;
    private String category;

    // Constructor
    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Method to display item details
    public void displayItemInfo() {
        System.out.println("Name: " + name + ", Price: $" + price + ", Category: " + category);
    }
}