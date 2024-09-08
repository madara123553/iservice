package com.trial.istudentservice;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class StudentController {
@Autowired
	private StudentService studentservice;
@GetMapping("/Student")
public List<Student> getAllRecords()
{
	return studentservice.getAllStudent();
}
@PostMapping("/Student")
public void insertingRecord(@RequestBody Student student)
{
	studentservice.insert(student);
}
}
