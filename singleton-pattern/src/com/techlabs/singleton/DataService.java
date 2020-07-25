package com.techlabs.singleton;

public class DataService {
	private static DataService bucket;

	private DataService() {
	}

	public static DataService getInstance() {
		if (bucket == null) {
			bucket = new DataService();
		}

		return bucket;
	}

	public void processData() {
		System.out.println(bucket.hashCode());
	}
}
