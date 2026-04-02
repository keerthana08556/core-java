class SwiggyRunner{
	public static void main(String[] args){
		Swiggy sw = new Swiggy();

    boolean loginStatus = sw.login("Keerthana","keeru@123");
	    System.out.println("Login status:"+loginStatus);

        String otpLogin = sw.login(7892694083L,1234);
        System.out.println(otpLogin);

        System.out.println(sw.search("Gowdru Mane Chicken Biriyani"));
        System.out.println(sw.search("Chicken Biriyani","Gowdru Mane"));
        System.out.println(sw.search("Chicken Biriyani","Gowdru Mane",250));
        System.out.println(sw.search("Chicken Biriyani","Gowdru Mane",250,"Non-Veg"));
        System.out.println(sw.search("Chicken Biriyani","Gowdru Mane",250,"Non-Veg","Full"));
  }
}