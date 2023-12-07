package com.spring.jdbc.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.springjdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// insert query
    	String query = "insert into student(id, name, city) values(?,?,?)";
    	int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	public int change(Student student) {
		// updating data
		String query="update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}
	
	public int delete(Student student) {
		// delete data
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, student.getId());
		return r;
	}
	
	public Student getStudent(int studentId) {
		String query = "select * from student where id=?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		
//		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
		
		// using anonymous class
		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				
				return student;
			}
			
		}, studentId);
		return student;
	}
	
	public List<Student> getAllStudents() {
		
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students; 
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
