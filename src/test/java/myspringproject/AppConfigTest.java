package myspringproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class AppConfigTest {
	
	
	private AnnotationConfigApplicationContext context;

	@Test
    public void test() 
	{
		
		   context = new AnnotationConfigApplicationContext();
		   context.register(AppConfig.class);
		   context.refresh();
	       System.out.println("--Result by Setter based Dependency Injection--");
	       Product product = (Product)context.getBean("product");
	       product.print();
	       System.out.println("--Result by Constructor based Dependency Injection--");
	       Employee employee = context.getBean(Employee.class);
	       employee.print();
	       context.close();
	}

}
