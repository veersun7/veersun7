package com.nirm.springjdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObj;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObj = new JdbcTemplate(dataSource);

	}

	@Override
	public void create(String name, int age) {
		String query = "Insert into Student(name,age) values(?,?)";
		jdbcTemplateObj.update(query, name, age);
		System.out.println("Created record name = "+ name + "Age="+age);
		
		return;
	}

	@Override
	public Student getStudent(Integer id) {
		String query = "select * from Student where id = ? ";
	Student student = jdbcTemplateObj.queryForObject(query, new Object[] {id}, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String query = "select * from Student";
		List<Student> students = jdbcTemplateObj.query(query, new StudentMapper());
		return students;
	}

	@Override
	public void delete(Integer id) {
		String query = "delete from student where id = ?";
		jdbcTemplateObj.update(query, id);
		System.out.println("Deleted record with id = "+id);
		return;
	}
	

	@Override
	public void update(Integer id, Integer age) {
		String query = "update student set age = ? where id =?";
		jdbcTemplateObj.update(query, age, id);
		System.out.println("Updated record with id = "+id);
		return;
	}
	}


