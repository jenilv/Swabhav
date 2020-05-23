package com.techlabs.analyzer;

public class FileLoader implements ILoadable {

	private String url;

	public FileLoader(String url) {
		this.url = url;
	}

	@Override
	public IParsable parseEmployees() {
		return new FileParser(url);
	}
}
