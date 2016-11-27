package com.sunnycorp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headers {
	public String getAccept() {
		return accept;
	}
	@JsonProperty("Accept")
	public void setAccept(String accept) {
		this.accept = accept;
	}
	
	@JsonProperty("Connection")
	public String getConnection() {
		return connection;
	}
	@JsonProperty("User-Agent")
	public void setConnection(String connection) {
		this.connection = connection;
	}
	@JsonProperty("HOST")
	public String getHost() {
		return host;
	}
	@JsonProperty("Host")
	public void setHost(String host) {
		this.host = host;
	}
	private String accept;
	private String connection;
	private String host;
}
