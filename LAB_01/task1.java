class Product {
    String name;
    float price;
    int quantity;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("-------------------------");
    }
}

public class task1 {
    public static void main(String[] args) {
        Product product1 = new Product("Marker", 50.75f, 120);
        Product product2 = new Product("Pen", 15.00f, 500);

        product1.displayDetails();
        product2.displayDetails();
    }
}
