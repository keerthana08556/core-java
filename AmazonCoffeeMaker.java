class AmazonCoffeeMaker {

    public static void brewCoffee() {
        System.out.println("Coffee maker is brewing fresh coffee");
    }

    public static void getCoffeeMakerDetails(String brand,
                                             int capacity,
                                             String type,
                                             int power,
                                             String color) {

        System.out.println("Invoking getCoffeeMakerDetails");
        System.out.println("Brand : " + brand);
        System.out.println("Capacity : " + capacity + " cups");
        System.out.println("Type : " + type);
        System.out.println("Power : " + power + " watts");
        System.out.println("Color : " + color);
    }

    public static void getPrice(double price) {
        System.out.println("Price of Coffee Maker : ₹" + price);
    }
}