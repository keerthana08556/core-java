class ProductManager {

    String productName;
    int productId;
    double price;
    String category;
    String brand;

    
    ProductManager() {
        this("Laptop", 1001);
        System.out.println("Default Constructor");
    }

    
    ProductManager(String productName, int productId) {
        this(productName, productId, 55000.0);
        System.out.println("Two Parameter Constructor");
    }

    
    ProductManager(String productName, int productId, double price) {
        this(productName, productId, price, "Electronics");
        System.out.println("Three Parameter Constructor");
    }

    
    ProductManager(String productName, int productId, double price, String category) {
        this(productName, productId, price, category, "Dell");
        System.out.println("Four Parameter Constructor");
    }

    
    ProductManager(String productName, int productId, double price, String category, String brand) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.category = category;
        this.brand = brand;

        System.out.println("Product Name : " + productName);
        System.out.println("Product ID   : " + productId);
        System.out.println("Price        : " + price);
        System.out.println("Category     : " + category);
        System.out.println("Brand        : " + brand);
    }
}