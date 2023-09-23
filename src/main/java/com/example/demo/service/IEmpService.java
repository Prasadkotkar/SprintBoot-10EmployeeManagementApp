package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.bean.Employee;

public interface IEmpService {

	void addEmp(Employee e);

	List<Employee> getAllEmp();

	Employee getEMpById(int id);

	void deleteEMp(int id);

	Page<Employee> getEMpByPaginate(int currentPage, int size);

}