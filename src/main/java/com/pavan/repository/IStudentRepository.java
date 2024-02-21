package com.pavan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.entity.StudentTable;
@Repository
public interface IStudentRepository extends JpaRepository<StudentTable, Integer> {
	

}
