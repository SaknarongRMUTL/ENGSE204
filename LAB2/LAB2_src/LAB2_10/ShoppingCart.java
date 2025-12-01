package LAB2_10;
public class ShoppingCart {
    private Product[] items = new Product[10];
    private int itemCount = 0;
    public void addProduct(Product p) {
        if (itemCount < items.length) {
            items[itemCount] = p;
            itemCount++;
        }
    }
    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
}