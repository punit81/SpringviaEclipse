import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean2 b2= (Bean2) ac.getBean("bean2");
		b2.print1();
	}
}
