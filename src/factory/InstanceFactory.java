package factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceFactory {
	private static Map<String, Car> cars = null;

	public InstanceFactory() {
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("audi", 300000));
		cars.put("benz", new Car("benz", 400000));
	}

	public Car getCar(String brand) {
		return cars.get(brand);
	}
}
