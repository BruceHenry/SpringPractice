package spel;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("MyBeanPost.postProcessAfterInitialization()" + "|||" + arg0 + "|||" + arg1);
		return arg0;
	}
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("MyBeanPost.postProcessBeforeInitialization()" + "|||" + arg0 + "|||" + arg1);
		return arg0;
	}
}
