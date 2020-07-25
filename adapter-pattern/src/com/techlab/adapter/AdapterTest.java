package com.techlab.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		QueueAdapter<Integer> adapter = new QueueAdapter<Integer>();
		adapter.enqueue(20);
		adapter.enqueue(30);
		adapter.enqueue(50);

		System.out.println(adapter.count());
		System.out.println(adapter.dequeue());
		System.out.println(adapter.dequeue());
		System.out.println(adapter.count());

		QueueAdapter<String> adapter2 = new QueueAdapter<String>();
		adapter2.enqueue("Value1");
		adapter2.enqueue("Value2");
		adapter2.enqueue("Value3");

		System.out.println(adapter2.count());
		System.out.println(adapter2.dequeue());
		System.out.println(adapter2.dequeue());
		System.out.println(adapter2.count());
	}
}
