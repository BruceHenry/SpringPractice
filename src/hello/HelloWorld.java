package hello;

import java.util.ArrayList;

public class HelloWorld {
	private String name;
	private ArrayList list;
	public HelloWorld() {
		System.out.println("HelloWorld.HelloWorld()--Construtor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("HelloWorld.setName()");
		this.name = name;
	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList a) {
		this.list = a;
	}

	public void hello() {
		System.out.println("Hello "+this.name);
	}

}
