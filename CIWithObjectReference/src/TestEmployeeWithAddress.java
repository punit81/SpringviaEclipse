import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployeeWithAddress {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeWithAddress e=(EmployeeWithAddress)ac.getBean("employeeBean");
		e.display();
	}

}
