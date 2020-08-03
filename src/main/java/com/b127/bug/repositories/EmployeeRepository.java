package com.b127.bug.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b127.bug.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
