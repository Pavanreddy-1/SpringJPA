package com.pavan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name= "Student_Table")
public class StudentTable {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "Std_Id")
	private Integer Studentid;
	@Column(name = "Std_Name")
	private String studentName;
	@Column(name = "Std_Branch")
	private String branch;
	@Column(name = "Std_Roll_No")
	private long rollNo;
	
	public Integer getStudentid() {
		return Studentid;
	}
	public void setStudentid(Integer studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	
	

}
