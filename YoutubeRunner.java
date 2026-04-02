class YouTubeRunner{

  public static void main(String[] arg){
   YouTube tube=new YouTube();
   String msg=tube.search("Arya2");
   System.out.println(msg);
   msg=tube.search("Arya2","Allu Arjun");
   System.out.println(msg);
   boolean login=tube.login("Keerthana.Nagaraj","Keeru@123");
   System.out.println(login);
   String result=tube.login("Keerthana.Nagaraj@gmail.com","Keeru@123","gr05ph");
   System.out.println(result);
  }
}