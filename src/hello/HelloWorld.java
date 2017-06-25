package hello;

public class HelloWorld {
	private String name;
	public HelloWorld() {
		System.out.println("HelloWorld.HelloWorld()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("HelloWorld.setName()");
		this.name = name;
	}

	public void hello() {
		System.out.println("Hello "+this.name);
	}

}
