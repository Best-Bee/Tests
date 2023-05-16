package p3;

import java.util.Arrays;

public class Demo {
	public static void Main() {
		Name name = new Name("John", "Doe");
		Car n1 = new Car("yes","no",10.2,name,4);
		Car n2 = new Car(n1);
	
		Truck t1 = new Truck("yes","no",10.2,name,true);
		Truck t2 = new Truck(t1);

		VehicleBag myBag = new VehicleBag(10);
		myBag.insert(n1);
		myBag.insert(n2);
		myBag.insert(t1);
		myBag.insert(t2);
	
		myBag.display();
	}
}
