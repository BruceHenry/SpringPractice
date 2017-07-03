package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.controller.UserController;
import annotation.repository.UserRepository;
import annotation.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");
		TestObject to = (TestObject) ctx.getBean("testObject");
		System.out.println(to);
		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService);
		
		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
		System.out.println(userRepository);
		

		
		
	}

}
