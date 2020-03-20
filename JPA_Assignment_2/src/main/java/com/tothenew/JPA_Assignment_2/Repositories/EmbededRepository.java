package com.tothenew.JPA_Assignment_2.Repositories;

import com.tothenew.JPA_Assignment_2.Entities.Embeded.EmployeeDetail;
import org.springframework.data.repository.CrudRepository;

public interface EmbededRepository extends CrudRepository<EmployeeDetail,Integer> {
}
