package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.entity.StudentTable;
import com.pavan.services.StudentServices;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	StudentServices serviceObj;

//	@GetMapping("/get")
//	public ResponseEntity<StudentTable> getData(@RequestParam Integer studentId, @RequestBody StudentTable studentOb) {
//		return serviceObj.getData(studentId, studentOb);
//	}

	@PostMapping("/postDetails")
	public ResponseEntity<StudentTable> saveData(@RequestBody StudentTable studentOb) {
		return serviceObj.saveStudentData(studentOb);
	}
	
	@PutMapping("/put")
    public ResponseEntity<StudentTable> updateEmployee(@RequestParam Integer studentId, @RequestBody StudentTable studentDetails) {
		

		return serviceObj.updateEmployee(studentId,studentDetails);

    }
	 @DeleteMapping("/delete")
	    public ResponseEntity<Void> deleteStudent(@RequestParam Integer studentId) {
	        ResponseEntity<Void> response = serviceObj.deleteStudent(studentId);
	        return response;
	    }
}
