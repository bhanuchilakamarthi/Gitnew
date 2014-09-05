package springjdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class Studentdao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;
	}

	/*public Boolean saveEmployeeByPreparedStatement(final Student s) {
		String query = "insert into student values(?,?,?)";
		return jdbcTemplate.execute(query,
				new PreparedStatementCallback<Boolean>() {

					public Boolean doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {

						ps.setInt(1, s.getId());
						ps.setString(2, s.getName());
						ps.setFloat(3, s.getMarks());

						return ps.execute();

					}
				});
	}*/

	public Boolean saveStudentByPreparedStatement(final Student s) {
		String query = "insert into student values(?,?,?)";
	    String query2 = "update table student set ename=bhanu2 where eid=8";
		return jdbcTemplate.execute(query,
				new PreparedStatementCallback<Boolean>() {

					public Boolean doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
System.out.println(s.getId()+" "+s.getName());
						ps.setInt(1, s.getId());
						ps.setString(2, s.getName());
						ps.setFloat(3, s.getMarks());

						return ps.execute();

					}
				});
	}
	/*public Boolean saveStudentByPreparedStatement(final Student s) {
		String query = "insert into student values(?,?,?)";
	    String query2 = "update table student set ename=bhanu2 where eid=8";
		return jdbcTemplate.execute(query,
				new PreparedStatementCallback<Boolean>() {

					public Boolean doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
System.out.println(s.getId()+" "+s.getName());
						ps.setInt(1, s.getId());
						ps.setString(2, s.getName());
						ps.setFloat(3, s.getMarks());

						return ps.execute();

					}
				});
	}*/

	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
