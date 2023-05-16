package p2;

public class Demo {
	public static void main(String[] args) {
		Book b1 = new Book("a", 2.0);
		Book b2 = new Book("b", 1.0);
		Book b3 = new Book("c", 5.0);
	
		GQueue<Book> queue = new GQueue<Book>();
		
		queue.insert(b1);
		queue.insert(b2);
		queue.insert(b3);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}
}
