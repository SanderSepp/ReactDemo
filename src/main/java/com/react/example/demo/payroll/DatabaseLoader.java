package com.react.example.demo.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{

  private final EmployeeRepository employeeRepository;

  @Autowired
  public DatabaseLoader(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  @Override
  public void run(String... strings) throws Exception {
    this.employeeRepository.save(new Employee("Micheal", "Scott", "Branch Manager"));
  }
}
