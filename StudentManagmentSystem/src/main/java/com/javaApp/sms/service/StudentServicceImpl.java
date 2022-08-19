
package com.javaApp.sms.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.javaApp.sms.entity.Student;
import com.javaApp.sms.repository.StudentRepo;

@Service
public class StudentServicceImpl implements StudentService {
	
	private StudentRepo studentRepo;
	public StudentServicceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);
		
	}

}
