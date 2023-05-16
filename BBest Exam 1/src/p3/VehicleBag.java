package p3;

import java.util.Arrays;

public class VehicleBag {
	private Vehicle[] arr;
	private int nElems;
	
	public VehicleBag(int maxSize) {
		arr = new Vehicle[maxSize];
		nElems = 0;
	}
	
	public Vehicle[] searchByMake (String make) {
		Vehicle[] temp = new Vehicle[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getMake().equals(make)) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public Vehicle[] searchByDoors(int doors) {
		Car[] temp = new Car[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if(arr[i] instanceof Car) {
				if(((Car)arr[i]).getDoors() == (doors)) {
					temp[count++] = (Car)arr[i];
				}
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public Vehicle[] removeNonEv(boolean isEV) {
		Vehicle[] temp = new Vehicle[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if ((!(((Truck) arr[i]).isEV())) && arr[i] instanceof Truck) {
				temp[count++] = arr[i];
				for(int j = i; j < nElems-1; j++) {
					arr[j] = arr[j+1];
				}
				nElems--;
				i--;
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public void insert(Vehicle vehicle ) {
		arr[nElems++] = vehicle;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
