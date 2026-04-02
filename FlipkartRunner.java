class FlipkartRunner{
	
    public static void main(String[] args){
		Flipkart fk = new Flipkart();
		
	boolean loginStatus = fk.login("Keerthana","keeru@123");
		System.out.println("Login status:"+loginStatus);

        String otpLogin = fk.login(7892694083L,1234);
        System.out.println(otpLogin);

        System.out.println(fk.search("Kurti"));
        System.out.println(fk.search("Kurti","Zara"));
        System.out.println(fk.search("Kurti","Zara",1500));
        System.out.println(fk.search("Kurti","Zara",1500,"Red"));
        System.out.println(fk.search("Kurti","Zara",1500,"Red","M"));
  }
}