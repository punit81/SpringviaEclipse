import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student st=(Student)ac.getBean("studentBean1");
		st.getMarksheet().put(new Subject("Biology"),89 );
		Subject sub1=null;
		for(Subject sub:st.getMarksheet().keySet())
		{
			if(sub.getSubjectName().equals("Computer Science")) {
				sub1=sub;
				break;
			}
		}
		st.getMarksheet().remove(sub1);
		st.display();
		Student st1=(Student)ac.getBean("studentBean");
		st1.display();
		
	}

}
