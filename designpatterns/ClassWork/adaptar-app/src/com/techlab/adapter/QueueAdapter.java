package com.techlab.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements IQueue<T>, Iterable<T> {

	private LinkedList<T> queue;
	private final int TOP = 0;
		
	public QueueAdapter() {
		this.queue = new LinkedList<T>();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return queue.iterator();
	}

	@Override
	public void enqueue(T item) {
		// TODO Auto-generated method stub
		queue.add(item);
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		T temp =  queue.get(TOP);
		queue.remove(TOP);
		return temp;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return queue.size();
	}

}
