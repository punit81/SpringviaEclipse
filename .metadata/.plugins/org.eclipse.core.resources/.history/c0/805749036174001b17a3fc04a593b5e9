import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		/*Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory=new XmlBeanFactory(res);*/
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s1=(Student)ac.getBean("studentBean");
		s1.display();
	}

}
