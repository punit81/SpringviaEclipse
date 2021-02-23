import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeTest {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee e=(Employee)ac.getBean("employeeBean");
	e.display();
}
}
