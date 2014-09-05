
package simpleSpringMaven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp2 {
	
		@SuppressWarnings("deprecation")
		public static void main(String args[])
		{
			//Triangle triangle= new Triangle();
			//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring1.xml"));
			AbstractApplicationContext context =new ClassPathXmlApplicationContext("codingint.xml");
			context.registerShutdownHook();
			Shape S=(Shape) context.getBean("C");
			S.draw();
		}

	}



