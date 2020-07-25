package com.techlab.adapter;

public interface IQueue<T> extends Iterable<T> {

	public void enqueue(T value);

	public T dequeue();

	public int count();
}
