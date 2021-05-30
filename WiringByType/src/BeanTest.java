import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applictionContext.xml");
		Bean2 b2=(Bean2)ac.getBean("Bean2");
		b2.print1();

	}

}
