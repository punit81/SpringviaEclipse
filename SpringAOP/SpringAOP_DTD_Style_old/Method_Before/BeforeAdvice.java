package Method_Before;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method m1, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("Inside before advice!");
		
	}

}
