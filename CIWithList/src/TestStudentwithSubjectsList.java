import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentwithSubjectsList {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentwithSubjectsList st=(StudentwithSubjectsList)ac.getBean("studentBean");
		st.display();
	}

}
