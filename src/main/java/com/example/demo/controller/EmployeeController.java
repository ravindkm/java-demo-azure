package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  EmployeeService empService;

  @GetMapping
  public List<Employee> firstPage() {
      return empService.getAllEmployees();
  }
  
  @GetMapping("/hello")
  public String hello() {
	  return "Welcome";
  }

}