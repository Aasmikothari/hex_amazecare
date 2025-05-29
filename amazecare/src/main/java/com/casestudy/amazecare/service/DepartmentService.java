package com.casestudy.amazecare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.casestudy.amazecare.exception.ResourceNotFoundException;
import com.casestudy.amazecare.model.Department;
import com.casestudy.amazecare.repository.DepartmentRepository;

/**
 * Service class for handling business logic related to Departments.
 */
@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    // Constructor-based dependency injection
    public DepartmentService(DepartmentRepository departmentRepository) {
        super();
        this.departmentRepository = departmentRepository;
    }


}