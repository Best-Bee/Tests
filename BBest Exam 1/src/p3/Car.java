package p3;

public class Car extends Vehicle{

	private int doors;
	
	public Car(String make, String year, double price, Name owerName, int doors) {
		super(make, year, price, owerName);
		this.doors = doors;
	}
	public Car(Car car) {
		super(car);
		this.setDoors(car.getDoors());
		this.setMake(car.getMake());
		this.setOwnerName(car.ownerName.getFirstName(),car.ownerName.getLastName());
		this.setPrice(car.getPrice());
		this.setYear(car.getYear());
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Car [" + super.toString() + ", doors=" + doors + "]";
	}

}
