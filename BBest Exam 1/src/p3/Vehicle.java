package p3;

public abstract class Vehicle {
	private String make;
	private String year;
	private double price;
	Name ownerName = new Name();
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
	public Name getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String firstName, String lastName) {
		ownerName.setFirstName(firstName);
		ownerName.setLastName(lastName);
	}
	public Vehicle(String make, String year, double price, Name owerName) {
		super();
		this.make = make;
		this.year = year;
		this.price = price;
		this.ownerName = owerName;
	}
	public Vehicle(Vehicle vehicle) {
		super();
		this.make = vehicle.getMake();
		this.year = vehicle.getYear();
		this.price = vehicle.getPrice();
		this.ownerName.setFirstName(vehicle.ownerName.getFirstName());
		this.ownerName.setLastName(vehicle.ownerName.getLastName());
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", year=" + year + ", Price=" + price + ", owerName=" + ownerName + "]";
	}
}

