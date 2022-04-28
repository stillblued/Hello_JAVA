package com.yedam.java.ch06_03;

public class Box<T> {

//	private Object object;

	private T t;

//	public Object getObject() {return object;}

	public T get() {return t;}

//	public void setObject(Object object) {this.object = object;}

	public void set(T t) {this.t = t;}

}
