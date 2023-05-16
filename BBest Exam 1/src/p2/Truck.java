package p2;

public class Truck extends Vehicle{

	private boolean isEV;
	private double temp;
	
	public Truck(String make, String year, double price, Name owerName, boolean isEV) {
		super(make, year, price, owerName);
		temp = price;
		this.isEV = isEV;
	}

	public Truck(Truck truck) {
		super(truck);
		temp = truck.getPrice();
		this.setEV(truck.isEV());
		this.setMake(truck.getMake());
		this.setOwnerName(truck.ownerName.getFirstName(),truck.ownerName.getLastName());
		this.setPrice(truck.getPrice());
		this.setYear(truck.getYear());
	}
	
	public boolean isEV() {
		return isEV;
	}

	public void setEV(boolean isEV) {
		this.isEV = isEV;
	}

	@Override
	public String toString() {
		return "Truck [" + super.toString() + ", isEV=" + isEV + "]";
	}
	
	@Override
	public double getPrice() {
		if (isEV) {
			return (temp * .9);
		}
		return (temp * 1.1);
	}
}
