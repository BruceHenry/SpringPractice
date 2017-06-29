package spel;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Spel {
	public static void main(String[] args) throws SQLException {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spel.xml");
		HelloWorld hw = (HelloWorld) ctx.getBean("spelBean");
		hw.hello();
		ctx.close();
	}

}
