package com.tothenew.JPA_Assignment_2.Repositories;

import com.tothenew.JPA_Assignment_2.Entities.InheritanceMapping.Payment;
import org.springframework.data.repository.CrudRepository;

public interface InheritanceRepository extends CrudRepository<Payment,Integer> {
}
