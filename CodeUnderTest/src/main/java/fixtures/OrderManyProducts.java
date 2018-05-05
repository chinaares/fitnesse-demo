package fixtures;

import shop.*;

public class OrderManyProducts {

    private ProductCatalog catalog;
    private Order order;

    public OrderManyProducts() {
        catalog = new ProductCatalog();
        order = new Order();
    }

    public void addProductNameAndPrice(String name, double price) {
        catalog.addProduct(name, price);
    }

    public void orderOf(String name, int quantity) {
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quantity);
    }

    public double total() {
        return order.getTotal();
    }
}
