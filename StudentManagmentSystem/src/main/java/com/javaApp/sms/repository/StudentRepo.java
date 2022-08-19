package com.javaApp.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaApp.sms.entity.Student;


public interface StudentRepo extends JpaRepository<Student, Long>{//jpa needed 2 parameter 1st=type of the jpa entity 2nd=type of the primary key
//jpaRepository is simple already class having @repository annotation into it 	

}
