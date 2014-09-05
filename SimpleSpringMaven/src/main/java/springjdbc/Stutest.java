package springjdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stutest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"springjdbc/studentcontext.xml");
		Studentdao dao = (Studentdao) ctx.getBean("edao");
		// int status=dao.saveStudent(new Student(102,"bhanu",50000));
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter student no :");
		int no = scn.nextInt();
		System.out.println("Enter student name :");
		String n = scn.next();
		System.out.println("Enter student marks :");
		float m = scn.nextFloat();
		Student s1=new Student(no, n, m);
		dao.saveStudentByPreparedStatement(s1);
System.out.println("inserted sucess");
	}
}