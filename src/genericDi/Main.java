package genericDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("genericDi.xml");
		UserService us = (UserService) ctx.getBean("userService");
		us.add();
	}
}
