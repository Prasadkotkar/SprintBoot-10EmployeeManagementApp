package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
