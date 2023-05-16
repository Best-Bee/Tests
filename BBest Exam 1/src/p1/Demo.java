package p1;

public class Demo {

	public static void main(String[] args) {
		Name name = new Name("John", "Doe");
		Vehicle n1 = new Vehicle("yes","no",10.2,name);
//		Name n2 = n1; // shallow copy
		Vehicle n2 = new Vehicle(n1);
		n1.setOwerName("James","May");
		n1.setPrice(46.2);
		
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		
	}

}