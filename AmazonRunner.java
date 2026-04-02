class AmazonRunner {

  public static void main(String[] arg) {

    Amazon amazon = new Amazon();

    boolean login = amazon.login("Keerthana.Nagaraj", "keeru@123");
    System.out.println(login);
    
    String result = amazon.login(7892694083L, 1234);
    System.out.println(result);
    
    String msg = amazon.search("Mobile");
    System.out.println(msg);
	
    msg = amazon.search("Mobile", "Samsung");
    System.out.println(msg);
    
    msg = amazon.search("Mobile", "Samsung", 20000);
    System.out.println(msg);

    msg = amazon.search("Mobile", "Samsung", 20000, "Black");
    System.out.println(msg);

    msg = amazon.search("Mobile", "Samsung", 20000, "Black", "6GB");
    System.out.println(msg);
  }
}