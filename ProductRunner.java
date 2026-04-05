class ProductRunner {
    public static void main(String[] args) {

        ProductManager p1 = new ProductManager();

        System.out.println("------------------");

        ProductManager p2 = new ProductManager("Mobile", 2002);

        System.out.println("------------------");

        ProductManager p3 = new ProductManager("Tablet", 3003, 25000.0);

        System.out.println("------------------");

        ProductManager p4 = new ProductManager("Watch", 4004, 5000.0, "Accessories");

        System.out.println("------------------");

        ProductManager p5 = new ProductManager("Headphones", 5005, 3000.0, "Audio", "Sony");
    }
}