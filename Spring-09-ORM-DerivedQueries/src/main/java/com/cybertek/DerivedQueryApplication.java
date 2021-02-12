package com.cybertek;

import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.EmployeeRepository;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedQueryApplication {

	@Autowired
	RegionRepository regionRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DerivedQueryApplication.class, args);
	}

	@PostConstruct
	public void testRegions(){
		System.out.println("---------Regions start------------");
		System.out.println("findByCountry => " + regionRepository.findByCountry("Canada"));


		System.out.println("---------Regions End------------");

	}

	@PostConstruct
	public void testDepartments(){

	}

	@PostConstruct
	public void testEmployees(){

	}

}
