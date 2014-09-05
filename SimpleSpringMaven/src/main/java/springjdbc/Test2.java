package springjdbc;


	import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.jdbc.core.JdbcTemplate;
	
	public class Test2 { 
	  
	public static void main(String[] args) {  
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc/applicationContext3.xml");  
	    EmployeeDao dao = (EmployeeDao) ctx.getBean("edo"); 
	     int status=dao.saveEmployee(new Employee(102,"bhanu",50000));  
	   System.out.println(status); 
	    dao.saveEmployee(new Employee(102,"Amrutha",45000));
	          
	    /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
	    System.out.println(status); 
	    */  
	          
	    /*Employee e=new Employee(); 
	    e.setId(102); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);*/  
	      
	
	}  

}
