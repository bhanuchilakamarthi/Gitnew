package simpleSpringMaven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
		@SuppressWarnings("deprecation")
		public static void main(String args[])
		{
			//Triangle triangle= new Triangle();
			//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring1.xml"));
			AbstractApplicationContext context =new ClassPathXmlApplicationContext("simpleSpringMaven/spring1.xml");
			context.registerShutdownHook();
			Tri5 triangle=(Tri5) context.getBean("triangle");
			triangle.draw();
		}

	}



