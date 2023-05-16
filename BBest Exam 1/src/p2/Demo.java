package p2;

public class Demo {
	public static void main(String[] args) {
		Name name = new Name("John", "Doe");
		Car n1 = new Car("yes","no",10.2,name,4);
		Car n2 = new Car(n1);
		n1.setOwnerName("James","May");
		n1.setMake("BMW");
		n1.setYear("1853");
		n1.setPrice(46.2);
		
		Truck t1 = new Truck("yes","no",10.2,name,true);
		Truck t2 = new Truck(t1);
		t1.setOwnerName("timmothy","alex");
		t1.setMake("BMW");
		t1.setEV(false);
		t1.setYear("1853");
		t1.setPrice(46.2);
		
		
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		
		
	}
}
