package com.sunnycorp.model;

public class Source {
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	private String url;
	private String origin;
	public Headers getHeaders() {
		return headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	private Headers headers;
}