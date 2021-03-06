package com.techlab.adapter.test;

import com.techlab.adapter.*;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IQueue<Integer> q = new QueueAdapter<Integer>();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		System.out.println("Count: " + q.count());

		System.out.println("Dequeue: " + q.dequeue());
		System.out.println("Dequeue: " + q.dequeue());
		System.out.println("Count: " + q.count());

		q.enqueue(20);
		q.enqueue(30);
		
		System.out.println("Iterating");
		for (int e : q) {
			System.out.println(e);
		}
	}

}
