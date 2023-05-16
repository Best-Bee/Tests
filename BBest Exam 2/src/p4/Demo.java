package p4;

public class Demo {
	public static void main(String[] args) {
		Link link1 = new Link(1);
		Link link2 = new Link(2);
		Link link3 = new Link(3);
	
		GQueue<Link> q1 = new GQueue<Link>();
		
		q1.insert(link1);
		q1.insert(link2);
		q1.insert(link3);
		
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		
	}
}
