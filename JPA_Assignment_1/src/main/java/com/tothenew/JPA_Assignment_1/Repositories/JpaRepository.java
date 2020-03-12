package com.tothenew.JPA_Assignment_1.Repositories;

//Question-2

import com.tothenew.JPA_Assignment_1.Entities.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JpaRepository extends CrudRepository<Employee,Integer> {

    List<Employee> findByName(String name);

    List<Employee> findByNameLike(String s);

    List<Employee> findByAgeBetween(int i, int i1);
}