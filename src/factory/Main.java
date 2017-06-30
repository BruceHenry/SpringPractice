package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("factory.xml");
		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1);
		System.out.println("----------------------");
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
		System.out.println("----------------------");
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("CarFactoryBean.xml");
		Car car3 = (Car) ctx2.getBean("car");
		System.out.println(car3);
	}

}
