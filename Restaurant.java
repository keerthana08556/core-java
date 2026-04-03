class Restaurant{

	String restaurantName;
	String chefName;
	static int noOfTables = 20;
	String ownerName;
	String location;
	String famousDish;

	public Restaurant(){
	}

	public Restaurant(String restaurantName,String chefName,String ownerName,String location,String famousDish){

		this.restaurantName = restaurantName;
		this.chefName = chefName;
		this.ownerName = ownerName;
		this.location = location;
		this.famousDish = famousDish;
	}

	public void displayRestaurantDetails(){

		System.out.println("Restaurant Name:"+restaurantName);
		System.out.println("Chef Name:"+chefName);
		System.out.println("No Of Tables:"+noOfTables);
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Location:"+location);
		System.out.println("Famous Dish:"+famousDish);
		System.out.println("---------------------------");
	}
}