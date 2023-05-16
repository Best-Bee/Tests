package p4;

import java.util.LinkedList;

public class GQueue <E extends Object>{
	private LinkedList<E> arr;
	private int front;
	private int back;
	
	public GQueue() {
		front = 1;
		back = 0;
		arr = new LinkedList<E>();
	}

	public void insert(E value) {
		arr.add(value);
		front++;
	}
	
	public E remove() {
		return arr.remove(back);
	}
	
	public E peekNext() {
		return arr.get(back);
	}
}
