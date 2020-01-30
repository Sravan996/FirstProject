package com.yotta.exam.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yotta.exam.model.Examination;
import com.yotta.exam.repo.ExamRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExamContoller {
	
	@Autowired
	private ExamRepo examRepo;
	
	@PostMapping("/addQues")
	public Examination addQuestion(@Valid @RequestBody Examination exam) {
		
		return examRepo.save(exam);
	}
	
	@GetMapping("/questions")
	public List<Examination> getQuestions(){
		
		return examRepo.findAll();
		
	}
}
