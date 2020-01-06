
public class Car {
	 private String brand;
	 private int yOfFabrication;
	 private String colour;
	 private double price;
	 
	 
	 public Car(String brand, int yOfFabrication,String colour,double price) {
		 this.brand=brand;
		 this.yOfFabrication=yOfFabrication;
		 this.colour=colour;
		 this.setPrice(price);
	 }

	 public int compareTo(Car other) {
		 if(this.price<other.price)
			 return -1;
		 else if(this.price==other.price)
			 return 0;
		 else
			 return 1;
	 }
	 
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

}
