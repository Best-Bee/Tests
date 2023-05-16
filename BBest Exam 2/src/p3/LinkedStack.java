package p3;

public class LinkedStack {
	private Link first;
	private int count;

	public LinkedStack() {
		super();
		this.first = null;
		count = 0;
	}
	
	public Link pop() {
		Link temp = first;
		first = first.getNext();		
		count--;
		return temp;
	}
	
	public void push(Link newLink) {
		if(first == null) {
			first = newLink;
		} else {
			newLink.setNext(first);
			first = newLink;
		}
		count++;
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			System.out.println(current.toString());
			current = current.getNext();
		}
		
	}
	
	public int listLength() {
		return count;
	}

	public Link peek() {
		return first;
	}
	
}
