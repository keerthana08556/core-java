class Amazon {
	
  public boolean login(String userName, String psw) {
    System.out.println("invoking login using userName:" + userName + " and psw:" + psw);

    String reguserName = "Keerthana.Nagaraj";
    String regpsw = "keeru@123";
    boolean isLogin = false;

    if (userName.equals(reguserName) && psw.equals(regpsw)) {
      isLogin = true;
    }

    return isLogin;
  }

  public String login(long phnum, int otp) {
    System.out.println("invoking login using phone number:" + phnum + " otp:" + otp);

    long regphnum = 7892694083L;
    int regotp = 1234;
    String message;

    if (phnum == regphnum && otp == regotp) {
      message = "Login Successful";
    } else {
      message = "Login Failed";
    }

    return message;
  }
  
  public String search(String productName) {
    System.out.println("invoking search productName:" + productName);

    String message = "searched product Name is available: " + productName;
    return message;
  }

  public String search(String productName, String brand) {
    System.out.println("invoking search productName:" + productName + " and brand:" + brand);

    String message = "searched product Name:" + productName + " brand:" + brand + " is available";
    return message;
  }

  public String search(String productName, String brand, int price) {
    System.out.println("invoking search productName:" + productName + " brand:" + brand + " price:" + price);

    String message = "Product:" + productName + " brand:" + brand + " under price:" + price + " is available";
    return message;
  }

  public String search(String productName, String brand, int price, String color) {
    System.out.println("invoking search productName:" + productName + " brand:" + brand + " price:" + price + " color:" + color);

    String message = "Product:" + productName + " " + color + " color is available";
    return message;
  }

  public String search(String productName, String brand, int price, String color, String size) {
    System.out.println("invoking search productName:" + productName + " brand:" + brand + " price:" + price + " color:" + color + " size:" + size);

    String message = "Product:" + productName + " size:" + size + " is available";
    return message;
  }

}