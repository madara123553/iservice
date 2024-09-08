package com.trial.istudentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
@Autowired
	private StudentRepository studentrepository;


public List<Student> getAllStudent()
{
	return studentrepository.findAll();
}
public void insert(Student student) {
	studentrepository.save(student);
}
}
