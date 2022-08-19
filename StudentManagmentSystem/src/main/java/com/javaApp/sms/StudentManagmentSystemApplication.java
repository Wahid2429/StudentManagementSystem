package com.javaApp.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaApp.sms.entity.Student;
import com.javaApp.sms.repository.StudentRepo;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}
	@Autowired
	private StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {
//	Student std=new Student("Wahid", "Ahmad", "wa2429@gmail.com", 9470310025L);
//	studentRepo.save(std);
//	
//	Student std1=new Student("Narmada", "Behera", "nb2429@gmail.com", 7004587209L);
//	studentRepo.save(std1);
//	
//	Student std2=new Student("Priya", "Mishra", "pm7777@gmail.com", 7521088963L);
//	studentRepo.save(std2);
	}

}
