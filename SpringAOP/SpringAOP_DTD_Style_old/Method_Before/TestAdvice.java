package Method_Before;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestAdvice {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Method_Before/applicationContext.xml");
		//Resource r= new ClassPathResource("Method_Before/applicationContext.xml");
		//BeanFactory ac=new XmlBeanFactory(r); 
		A abean=ac.getBean("proxy",A.class);
		abean.method1();
	}

}
