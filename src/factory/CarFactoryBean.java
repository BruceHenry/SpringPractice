package factory;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean  implements FactoryBean{
	private String brand;
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car("BMW",400000);
	}

	@Override
	public Class<Car> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
