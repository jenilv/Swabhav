package com.techlabs.analyzer;

public class UrlLoader implements ILoadable {

	private String url;

	public UrlLoader(String url) {
		this.url = url;
	}

	@Override
	public IParsable parseEmployees() {
		return new UrlParser(url);
	}

}
