class YouTube{

  public String search(String movieName){
    System.out.println("invoking search movieName:"+movieName);
    String meassage=null;
	
	boolean islogin =login("Keerthana.Nagaraj","keeru@123");
	if(islogin){
		System.out.println("Login successfully");
    if(meassage!=null){
	  meassage="searched movie Name is available:"+movieName;
    }
	}else{
        meassage="Invalid UserName and Password";		
	}
    return meassage;
  }
  
  public String search(String movieName,String heroName){
    System.out.println("invoking search movieName:"+movieName+"and heroName:"+heroName);
    String meassage=null;
    if(meassage!=movieName && meassage!=heroName){
	  meassage="searched movie Name:"+movieName+"and hero Name:"+heroName+" is available";
    }
    return meassage;
  }
  public boolean login(String userName,String psw){
	  System.out.println("invoking login using userName:"+userName+" and psw:"+psw);
	  String reguserName="Keerthana.Nagaraj";
	  String regpsw="Keeru@123";
	  boolean islogin=false;
	  if(userName==reguserName && psw==regpsw){
		  islogin=true;
	  }else{
		  islogin=false;
	  }
	  return islogin;
    }
    public String login(String email,String psw,String captcha){
	  System.out.println("invoking login using email:"+email+" psw:"+psw+"captcha:"+captcha);
	  String regemail="Keerthana.Nagaraj@gmail.com";
	  String regpsw="Keeru@123";
	  String islogin=null;
	  if(email==regemail && psw==regpsw){
		  islogin="Login Successfully";
	  }else{
		  islogin="Login failled";
	  }
	  return islogin;
    }

}