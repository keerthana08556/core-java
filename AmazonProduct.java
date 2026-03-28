class AmazonProduct
{
    static String productNames[] = {"Samsung Galaxy M34","Redmi Note 13 Pro","Apple MacBook Air","Samsung Smart TV","Dell Inspiron Laptop","Sony PlayStation 4","Boat Rockerz Headphones"};

    static float productPrice[] = { 19999.6f, 20346.8f, 78459.1f, 12409.8f, 66758.1f, 45999.5f, 8999.9f};

    static double productRatings[] = {4.3, 4.4, 4.8, 4.2, 4.5, 4.6, 4.1 };

    public static void getAmazonProductDetails()
    {
        for(int i = 0; i < productNames.length; i++)
        {
            System.out.println("Product Name : " + productNames[i]);
            System.out.println("Product Price : " + productPrice[i]);
            System.out.println("Product Rating : " + productRatings[i]);
            System.out.println();
        }
    }
}