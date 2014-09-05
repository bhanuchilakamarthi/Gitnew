package springjdbc;
	import org.springframework.jdbc.core.JdbcTemplate;  
	  
	public class EmployeeDao {  
	private JdbcTemplate jdbcTemp;  
	  
	public void setJdbcTempla(JdbcTemplate jdbcTemp) {  
	    this.jdbcTemp = jdbcTemp;  
	}  
	  
	public int saveEmployee(Employee e){  
		
		  String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
				    return jdbcTemp.update(query);  
	}  
	public int updateEmployee(Employee e){  
	    String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemp.update(query);  
	}  
	public int deleteEmployee(Employee e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemp.update(query);  
	}  
	  
	} 


