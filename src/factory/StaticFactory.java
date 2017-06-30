package factory;

import java.util.HashMap;
import java.util.Map;

public class StaticFactory {
	private static Map<String, Car> cars = new HashMap<String, Car>();
	static {
		cars.put("audi", new Car("audi", 300000));
		cars.put("benz", new Car("benz", 400000));
	}

	public static Car getCar(String name) {
		return cars.get(name);
	}
}
