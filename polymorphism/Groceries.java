public class Groceries extends Product {
    public Groceries(String name, double price) {
        super(name, price);
    }

    @Override
    public void showCategory() {
        System.out.println("Category: Groceries - " + getName() + ", Price: $" + getPrice());
    }
}