package Method_After;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import Method_Before.A;
public class TestAdvice {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Method_After/applicationContext.xml");
		//Resource r= new ClassPathResource("Method_Before/applicationContext.xml");
		//BeanFactory ac=new XmlBeanFactory(r); 
		A abean=ac.getBean("proxy",A.class);
		abean.method1();
	}

}
