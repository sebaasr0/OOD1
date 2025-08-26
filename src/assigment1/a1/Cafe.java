package assigment1.a1;

public class Cafe {
    private MenuItem menuItem1;
    private MenuItem menuItem2;
    private MenuItem menuItem3;
    private order currentOrder;

    public void addMenuItem1(MenuItem item) {
        this.menuItem1 = item;
    }

    public void addMenuItem2(MenuItem item) {
        this.menuItem2 = item;
    }

    public void addMenuItem3(MenuItem item) {
        this.menuItem3 = item;
    }

    public MenuItem getMenuItem1() {
        return menuItem1;
    }

    public MenuItem getMenuItem2() {
        return menuItem2;
    }

    public MenuItem getMenuItem3() {
        return menuItem3;
    }

    public void placeOrder(order order) {
        this.currentOrder = order;
        currentOrder.calculateTotal();
    }

    public void displayMenu() {
        System.out.println("Cafe Menu:");
        if (menuItem1 != null) menuItem1.displayItemInfo();
        if (menuItem2 != null) menuItem2.displayItemInfo();
        if (menuItem3 != null) menuItem3.displayItemInfo();
    }
}