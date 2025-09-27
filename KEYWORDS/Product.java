class Product {
    static double discount = 5.0;
    private final int id;
    String name;
    double cost;
    int quantity;

    Product(String name, double cost, int quantity, int id) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.id = id;
    }

    void display() {
        if (this instanceof Product) {
            System.out.println("---- Product Details ----");
            System.out.println("Product ID: " + this.id);
            System.out.println("Product Name: " + this.name);
            System.out.println("Price: $" + this.cost);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Discount: " + discount + " %");
        }
    }

    static void newdiscount(double newRate) {
        discount = newRate;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Headphones", 900, 3, 1);
        Product p2 = new Product("Keyboard", 100, 14, 2);
        Product p3 = new Product("Mouse", 150, 56, 3);

        p1.display();
        p2.display();
        p3.display();

        Product.newdiscount(12);
        System.out.println("Discount has been updated to 12% for all products!");

        p1.display();
        p2.display();
        p3.display();
    }
}
