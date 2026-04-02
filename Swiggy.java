class Swiggy {
	
	public boolean login(String userName,String psw){
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

    public String search(String foodName){
		System.out.println("invoking search foodName:"+foodName);
		String message="Food is available: "+foodName;
    return message;
  }

    public String search(String foodName,String restaurant){
		System.out.println("invoking search foodName:"+foodName+" restaurant:"+restaurant);
		String message="Food:"+foodName+" from "+restaurant+" is available";
    return message;
  }

    public String search(String foodName,String restaurant,int price){
        System.out.println("invoking search foodName:"+foodName+" restaurant:"+restaurant+" price:"+price);

        String message="Food:"+foodName+" under price:"+price+" is available";
    return message;
  }

    public String search(String foodName,String restaurant,int price,String type){
        System.out.println("invoking search foodName:"+foodName+" restaurant:"+restaurant+" price:"+price+" type:"+type);

        String message="Food:"+foodName+" type:"+type+" is available";
    return message;
  }

    public String search(String foodName,String restaurant,int price,String type,String size){
        System.out.println("invoking search foodName:"+foodName+" restaurant:"+restaurant+" price:"+price+" type:"+type+" size:"+size);

        String message="Food:"+foodName+" size:"+size+" is available";
    return message;
  }

}