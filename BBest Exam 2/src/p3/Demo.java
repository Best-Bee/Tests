package p3;

public class Demo {
	public static void main(String[] args) {
		Link link1 = new Link(1);
		Link link2 = new Link(2);
		Link link3 = new Link(3);
	
		LinkedStack linkedStack = new LinkedStack();
		
		linkedStack.push(link1);
		linkedStack.push(link2);
		linkedStack.push(link3);
		
		System.out.println(linkedStack.peek() + "\n");
		
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop() + "\n");
		
		System.out.println(linkedStack.peek());
	}
}
