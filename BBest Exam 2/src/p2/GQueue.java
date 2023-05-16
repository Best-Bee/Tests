package p2;

import java.util.ArrayList;

public class GQueue <E>{
	private ArrayList<E> arr;
	private int front;
	private int back;
	
	public GQueue() {
		front = 1;
		back = 0;
		arr = new ArrayList<E>();
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
