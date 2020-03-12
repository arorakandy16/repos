package com.tothenew.JPA_Assignment_1.Repositories;

import com.tothenew.JPA_Assignment_1.Entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PagingRepository extends PagingAndSortingRepository<Employee,Integer> {
}