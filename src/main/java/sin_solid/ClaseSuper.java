package sin_solid;

public class ClaseSuper{}

public class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public double applyDiscount() {
        if (category.equals("Electronics")) {
            return price * 0.9; // 10% descuento para electrónicos
        } else if (category.equals("Clothing")) {
            return price * 0.8; // 20% descuento para ropa
        }
        return price;
    }

    public void saveToDatabase() {
        // Simulación de guardar en la base de datos
        System.out.println("Guardando " + name + " en la base de datos...");
    }
}

 public class Order {
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        double discountedPrice = product.applyDiscount();
        return discountedPrice * quantity;
    }

    public void printReceipt() {
        System.out.println("Recibo:");
        System.out.println("Producto: " + product.getName());
        System.out.println("Cantidad: " + quantity);
        System.out.println("Total: " + calculateTotalPrice());
    }
}
