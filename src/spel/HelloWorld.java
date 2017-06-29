package spel;

public class HelloWorld {
	private String name;

	public static void init() {
		System.out.println("HelloWorld.init()");
	}

	public void destroy() {
		System.out.println("HelloWorld.destroy()");
	}

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

	public void hello() {
		System.out.println("Hello " + this.name);
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}

}
