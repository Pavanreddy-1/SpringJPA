package com.pavan.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.pavan.entity.StudentTable;
import com.pavan.repository.IStudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	IStudentRepository  studentRepository;
	
//	Get Mapping

//	public ResponseEntity<StudentTable> getStudent(Integer studentId, StudentTable studentDetails) {
//	    Optional<StudentTable> optionalStudent = studentRepository.findById(studentId);
//
//	    if (optionalStudent.isPresent()) {
//	        StudentTable student = optionalStudent.get();
//	        return ResponseEntity.ok(student);
//	    } else {
//	        // Student not found
//	        return ResponseEntity.notFound().build();
//	    }
//	}

	
//	Post Mapping
	
	public ResponseEntity<StudentTable> saveStudentData(StudentTable studentOb){
		
		StudentTable studentObj=new StudentTable();
		studentObj.setStudentName(studentOb.getStudentName());
		studentObj.setBranch(studentOb.getBranch());
		studentObj.setRollNo(studentOb.getRollNo());
		StudentTable result=studentRepository.save(studentObj);
		return new ResponseEntity<StudentTable>(result,HttpStatus.OK);
		

	}
//put mapping
	public ResponseEntity<StudentTable> updateEmployee(Integer studentId, StudentTable studentDetails) {

		Optional<StudentTable> updateEmployee = studentRepository.findById(studentId);
		StudentTable emplyee = null;

		if (updateEmployee.isPresent()) {
			emplyee = updateEmployee.get();
		}
		
		emplyee.setStudentName(studentDetails.getStudentName());
		emplyee.setBranch(studentDetails.getBranch());
		emplyee.setRollNo(studentDetails.getRollNo());

		StudentTable result = studentRepository.save(emplyee);
		return new ResponseEntity<StudentTable>(result, HttpStatus.OK);

	}
//	delete MApping
	public ResponseEntity<Void> deleteStudent(Integer studentId) {
        Optional<StudentTable> optionalStudent = studentRepository.findById(studentId);

        if (optionalStudent.isPresent()) {
            // Student exists, delete it
            studentRepository.deleteById(studentId);
            return ResponseEntity.ok().build();
        } else {
            // Student not found
            return ResponseEntity.notFound().build();
        }
    }

}
