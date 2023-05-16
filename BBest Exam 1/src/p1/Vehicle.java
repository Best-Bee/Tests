package p1;

public class Vehicle {
	private String make;
	private String year;
	private double price;
	Name owerName = new Name();
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Name getOwerName() {
		return owerName;
	}
	public void setOwerName(String firstName, String lastName) {
		owerName.setFirstName(firstName);
		owerName.setLastName(lastName);
	}
	public Vehicle(String make, String year, double price, Name owerName) {
		super();
		this.make = make;
		this.year = year;
		this.price = price;
		this.owerName = owerName;
	}
	public Vehicle(Vehicle vehicle) {
		super();
		this.make = vehicle.getMake();
		this.year = vehicle.getYear();
		this.price = vehicle.getPrice();
		this.owerName.setFirstName(vehicle.owerName.getFirstName());
		this.owerName.setLastName(vehicle.owerName.getLastName());
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", year=" + year + ", Price=" + price + ", owerName=" + owerName + "]";
	}
}
