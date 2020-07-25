package com.techlab.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements IQueue<T>, Iterable<T> {

	private LinkedList<T> queue;

	public QueueAdapter() {
		queue = new LinkedList<T>();
	}

	@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}

	@Override
	public void enqueue(T value) {
		queue.addFirst(value);
	}

	@Override
	public T dequeue() {
		return queue.removeLast();

	}

	@Override
	public int count() {
		return queue.size();
	}

}
