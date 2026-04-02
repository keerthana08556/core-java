class Flipkart {
	 
    public boolean login(String userName, String psw){
		System.out.println("invoking login using userName:"+userName+" and psw:"+psw);
		String regUserName="Keerthana";
        String regPsw="keeru@123";
        boolean isLogin=false;
		if(userName.equals(regUserName) && psw.equals(regPsw)){
			isLogin=true;
		}
		return isLogin;
  }
  
    public String login(long phnum,int otp){
		System.out.println("invoking login using phone number:"+phnum+" otp:"+otp);
 		long regPhnum=7892694083L;
        int regOtp=1234;
        String message;

		if(phnum==regPhnum && otp==regOtp){
			message="Login Successful";
    }else{
		message="Login Failed";
    }

    return message;
  }
  
  public String search(String dressName){
	  System.out.println("invoking search dressName:"+dressName);

    String message="searched dress is available: "+dressName;
    return message;
  }

  public String search(String dressName,String brand){
    System.out.println("invoking search dressName:"+dressName+" brand:"+brand);

    String message="Dress:"+dressName+" brand:"+brand+" is available";
    return message;
  }

  public String search(String dressName,String brand,int price){
    System.out.println("invoking search dressName:"+dressName+" brand:"+brand+" price:"+price);

    String message="Dress:"+dressName+" brand:"+brand+" under price:"+price+" is available";
    return message;
  }

  public String search(String dressName,String brand,int price,String color){
    System.out.println("invoking search dressName:"+dressName+" brand:"+brand+" price:"+price+" color:"+color);

    String message="Dress:"+dressName+" color:"+color+" is available";
    return message;
  }

  public String search(String dressName,String brand,int price,String color,String size){
    System.out.println("invoking search dressName:"+dressName+" brand:"+brand+" price:"+price+" color:"+color+" size:"+size);

    String message="Dress:"+dressName+" size:"+size+" is available";
    return message;
  }

}