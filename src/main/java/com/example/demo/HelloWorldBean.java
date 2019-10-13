package com.example.demo;

public class HelloWorldBean {

	private String messge;
	public HelloWorldBean(String messge) {
		this.messge=messge;
	}
	@Override
	public String toString() {
		return "HelloWorldBean [messge=" + messge + "]";
	}
	public String getMessge() {
		return messge;
	}
	public void setMessge(String messge) {
		this.messge = messge;
	}
	
	
	
}
