package factory;

public class Car {
	private String brand;
	private Integer price;
	public Car() {
		System.out.println("Car Constructor Car()");
	}
	
	public Car(String brand, Integer price) {
		this.brand = brand;
		this.price = price;
		System.out.println("Car Constructor Car(String brand, Integer price)");
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	

}
