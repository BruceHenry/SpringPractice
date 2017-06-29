package db;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DB {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("db.xml");
		DataSource ds = (DataSource) ctx.getBean("data");
		System.out.println(ds.getConnection());
	}

}
