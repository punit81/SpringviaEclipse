import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applictionContext.xml");
		Student st=(Student)ac.getBean("studentBean");
		st.display();
	}

}
