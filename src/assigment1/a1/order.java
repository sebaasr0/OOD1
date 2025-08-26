package assigment1.a1;

public class order {
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private double totalPrice;

    public void addItem1(MenuItem item) {
        this.item1 = item;
    }

    public void addItem2(MenuItem item) {
        this.item2 = item;
    }

    public void addItem3(MenuItem item) {
        this.item3 = item;
    }

    public void calculateTotal() {
        totalPrice = 0;
        if (item1 != null) totalPrice += item1.getPrice();
        if (item2 != null) totalPrice += item2.getPrice();
        if (item3 != null) totalPrice += item3.getPrice();
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        if (item1 != null) item1.displayItemInfo();
        if (item2 != null) item2.displayItemInfo();
        if (item3 != null) item3.displayItemInfo();
        System.out.println("Total Price: $" + totalPrice);
    }
}